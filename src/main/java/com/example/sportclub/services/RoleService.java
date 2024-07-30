package com.example.sportclub.services;

import com.example.sportclub.dtos.RoleGetDto;
import com.example.sportclub.entities.RoleEntity;
import com.example.sportclub.mappers.IRoleGetMapper;
import com.example.sportclub.repos.IRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoleService {

    @Autowired
    IRoleRepository roleRepository;

    public RoleService(IRoleRepository roleRepository){
        this.roleRepository = roleRepository;
    }


    public List<RoleGetDto> getAllRolesDto() {
        List<RoleEntity> roles = roleRepository.findAll();
        return IRoleGetMapper.INSTANCE.roleToRolesGetDto(roles);
    }

    public RoleEntity createNewRole(RoleEntity newRole) {
        return roleRepository.save(newRole);
    }




    public RoleGetDto getOneRoleDto(Long roleId) {
        RoleEntity role = roleRepository.findById(roleId).orElseThrow(() -> new RuntimeException("Role not found"));
        return IRoleGetMapper.INSTANCE.roleToRoleGetDto(role);
    }




    public RoleEntity updateRole(Long roleId, RoleEntity newRole) {
        Optional<RoleEntity> role = roleRepository.findById(roleId);
        if(role.isPresent()){
            RoleEntity foundedRole = role.get();
            foundedRole.setRole_name(newRole.getRole_name());
            foundedRole.setUser_role(newRole.getUser_role());
            roleRepository.save(foundedRole);
            return foundedRole;
        }
        return null;
    }

    public void deleteRole(Long roleId){
        roleRepository.deleteById(roleId);
    }

    public void deleteAllRole() {
        roleRepository.deleteAll();
    }
}
