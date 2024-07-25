package com.example.sportclub.repos;

import com.example.sportclub.entities.LogEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ILogRepository extends JpaRepository<LogEntity, Long> {
}
