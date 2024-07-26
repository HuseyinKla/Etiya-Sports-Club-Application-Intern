package com.example.sportclub.controllers;

import com.example.sportclub.entities.RoleEntity;
import com.example.sportclub.services.RoleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/roles")
public class RoleController {

    private RoleService roleService;


    public RoleController(RoleService roleService){
        this.roleService = roleService;
    }

    @GetMapping
    public List<RoleEntity> getAllRoles(){
        return roleService.getAllRoles();
    }

    @GetMapping("/{roleId}")
    public RoleEntity getOneRole(@PathVariable Long roleId){
        return roleService.getOneRole(roleId);
    }

    @PutMapping("/{roleId}")
    public RoleEntity updateRole(@PathVariable Long roleId, @RequestBody RoleEntity newRole){
        return roleService.updateRole(roleId, newRole);
    }

    @PostMapping
    public RoleEntity createNewRole(@RequestBody RoleEntity newRole){
        return roleService.createNewRole(newRole);
    }

    @DeleteMapping("/{roleId}")
    public void deleteRole(@PathVariable Long roleId){
        roleService.deleteRole(roleId);
    }

    @DeleteMapping("/deleteAll")
    public void deleteAllRole(){
        roleService.deleteAllRole();
    }


}
