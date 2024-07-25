package com.example.sportclub.repos;


import com.example.sportclub.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<UserEntity, Long> {


}
