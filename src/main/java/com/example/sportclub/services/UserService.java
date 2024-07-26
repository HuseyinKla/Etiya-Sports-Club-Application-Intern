package com.example.sportclub.services;

import com.example.sportclub.entities.UserEntity;
import com.example.sportclub.repos.IUserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    //add if coming data is not fit
    IUserRepository userRepository;

    public UserService(IUserRepository userRepository){
        this.userRepository = userRepository;
    }

    public List<UserEntity> getAllUsers() {
        return userRepository.findAll();
    }

    public UserEntity createNewUser(UserEntity newUser) {
        return userRepository.save(newUser);
    }

    public UserEntity findOneUser(Long userId) {
        //custom exception if userId DID NOT EXIST
        return userRepository.findById(userId).orElse(null);
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
