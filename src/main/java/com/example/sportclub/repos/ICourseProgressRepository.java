package com.example.sportclub.repos;

import com.example.sportclub.entities.CourseProgressEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICourseProgressRepository extends JpaRepository<CourseProgressEntity, Long> {
}
