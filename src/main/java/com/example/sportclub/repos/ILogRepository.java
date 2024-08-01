package com.example.sportclub.repos;

import com.example.sportclub.entities.LogEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ILogRepository extends JpaRepository<LogEntity, Long> {
    //List<LogEntity> findByUser_UserId(Long user_id);
}
