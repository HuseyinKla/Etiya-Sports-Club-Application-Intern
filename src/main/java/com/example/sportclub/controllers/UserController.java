package com.example.sportclub.controllers;


import com.example.sportclub.entities.UserEntity;
import com.example.sportclub.services.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping
    public List<UserEntity> getAllUsers(){
        return userService.getAllUsers();
    }

    @PostMapping
    public  UserEntity createNewUser(@RequestBody UserEntity newUser){
        return userService.createNewUser(newUser);
    }

    @GetMapping("/{userId}")
    public UserEntity findOneUser(@PathVariable Long userId){
        return userService.findOneUser(userId);
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
