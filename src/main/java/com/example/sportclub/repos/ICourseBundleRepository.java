package com.example.sportclub.repos;

import com.example.sportclub.entities.CourseBundleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICourseBundleRepository extends JpaRepository<CourseBundleEntity, Long> {
}
