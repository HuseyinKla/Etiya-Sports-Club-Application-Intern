package com.example.sportclub.services;

import com.example.sportclub.dtos.UserGetDto;
import com.example.sportclub.entities.CourseBundleEntity;
import com.example.sportclub.entities.RoleEntity;
import com.example.sportclub.entities.UserEntity;
import com.example.sportclub.mappers.IUserGetMapper;
import com.example.sportclub.repos.ICourseBundleRepository;
import com.example.sportclub.repos.IRoleRepository;
import com.example.sportclub.repos.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    //add if coming data is not fit
    @Autowired
    private IUserRepository userRepository;
    @Autowired
    private ICourseBundleRepository courseBundleRepository;
    @Autowired
    private IRoleRepository roleRepository;
    private RoleService roleService;


    public UserService(IUserRepository userRepository, RoleService roleService){
        this.userRepository = userRepository;
        this.roleService = roleService;
    }

    public List<UserGetDto> getAllUsersDto() {
        /*List<UserEntity> users = userRepository.findAll();
        List<UserGetDto> toSaves = IUserGetMapper.INSTANCE.userToUsersGetDto(users);
        toSaves.stream().map( save -> users.stream().map(user -> user.getRole().getUser_role_id()));
        return toSaves;*/
        List<UserEntity> users = userRepository.findAll();
        return IUserGetMapper.INSTANCE.userToUsersGetDto(users);
    }



    public UserGetDto findOneUserDto(Long userId) {
        /*UserEntity user = userRepository.findById(userId).orElseThrow(() -> new RuntimeException("User not found"));
        UserGetDto toSave = IUserGetMapper.INSTANCE.userToUserGetDto(user);
        toSave.setUser_role_id(user.getRole().getUser_role_id());
        return toSave;*/

        Optional<UserEntity> userOptional = userRepository.findById(userId);
        if (userOptional.isPresent()){
            return IUserGetMapper.INSTANCE.userToUserGetDto(userOptional.get());
        }else{
            throw new RuntimeException("User not found");
        }
    }


    public UserEntity createNewUser(UserEntity newUser) {
        return userRepository.save(newUser);
    }


    public UserEntity updateUser(Long userId, UserEntity newUser) {
        Optional<UserEntity> user = userRepository.findById(userId);
        if (user.isPresent()){
            UserEntity foundedUser = user.get();
            foundedUser.setUser_name(newUser.getUser_name());
            foundedUser.setUser_password(newUser.getUser_password());
            userRepository.save(foundedUser);
            return foundedUser;
        }
        return null;
    }

    public void deleteUser(Long userId) {
        userRepository.deleteById(userId);
    }

    public void deleteAllUser() {
        userRepository.deleteAll();
    }
}
