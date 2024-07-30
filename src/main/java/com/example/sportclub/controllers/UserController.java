package com.example.sportclub.controllers;


import com.example.sportclub.dtos.UserCreateDto;
import com.example.sportclub.dtos.UserGetDto;
import com.example.sportclub.entities.UserEntity;
import com.example.sportclub.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping
    public List<UserGetDto> getAllUsersDto(){
        return userService.getAllUsersDto();
    }

    @PostMapping
    public UserEntity createNewUser(@RequestBody UserEntity newUser){
        return userService.createNewUser(newUser);
    }

    @GetMapping("/{userId}")
    public UserGetDto findOneUserDto(@PathVariable Long userId){
        return userService.findOneUserDto(userId);
    }


    @PutMapping("/{userId}")
    public UserEntity updateUser(@PathVariable Long userId, @RequestBody UserEntity newUser){
        return userService.updateUser(userId, newUser);
    }

    @DeleteMapping("/{userId}")
    public void deleteUser(@PathVariable Long userId){
        userService.deleteUser(userId);
    }

    @DeleteMapping("/deleteAll")
    public void  deleteAllUser(){
        userService.deleteAllUser();
    }


}
