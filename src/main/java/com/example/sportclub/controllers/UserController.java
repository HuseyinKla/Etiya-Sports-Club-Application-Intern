package com.example.sportclub.controllers;


import com.example.sportclub.entities.UserEntity;
import com.example.sportclub.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
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
    public List<UserEntity> getAllUsers(){
        return userService.getAllUsers();
    }

    @PostMapping
    public ResponseEntity<UserEntity> createNewUser(@RequestBody UserEntity newUser){
        UserEntity savedUser = userService.createNewUser(newUser);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
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
