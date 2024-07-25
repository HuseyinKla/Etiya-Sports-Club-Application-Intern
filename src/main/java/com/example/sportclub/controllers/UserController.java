package com.example.sportclub.controllers;


import com.example.sportclub.entities.UserEntity;
import com.example.sportclub.repos.IUserRepository;
import com.example.sportclub.services.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
        return userService.saveUser(newUser);
    }

    @GetMapping("/{userId}")
    public UserEntity getOneUser(@PathVariable Long userId){
        return userService.findOneUser(userId);
    }


    @PutMapping("/{userId}")
    public UserEntity putOneUser(@PathVariable Long userId, @RequestBody UserEntity newUser){
        return userService.updateUser(userId, newUser);
    }

    @DeleteMapping("/{userId}")
    public void deleteOneUser(@PathVariable Long userId){
        userService.deleteUser(userId);
    }


}
