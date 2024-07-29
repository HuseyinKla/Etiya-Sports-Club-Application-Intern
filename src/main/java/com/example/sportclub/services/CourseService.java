package com.example.sportclub.services;

import com.example.sportclub.entities.CourseEntity;
import com.example.sportclub.repos.ICourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    private ICourseRepository courseRepository;

    public CourseService(ICourseRepository courseRepository){
        this.courseRepository = courseRepository;
    }


    public List<CourseEntity> getAllCourses() {
        return courseRepository.findAll();
    }

    public CourseEntity getOneCourse(Long courseId) {
        return courseRepository.findById(courseId).orElse(null);
    }

    public CourseEntity creteCourse(CourseEntity newCourse) {
        return courseRepository.save(newCourse);
    }

    public void deleteCourse(Long courseId) {
        courseRepository.deleteById((courseId));
    }
}
