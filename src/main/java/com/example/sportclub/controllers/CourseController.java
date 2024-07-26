package com.example.sportclub.controllers;


import com.example.sportclub.entities.CourseEntity;
import com.example.sportclub.services.CourseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {

    CourseService courseService;

    public CourseController(CourseService courseService){
        this.courseService = courseService;
    }

    @GetMapping
    public List<CourseEntity> getAllCourses(){
        return courseService.getAllCourses();
    }

    @GetMapping("/{courseId}")
    public CourseEntity getOneCourse(@PathVariable Long courseId){
        return courseService.getOneCourse(courseId);
    }

    @PostMapping
    public CourseEntity createCourse(@RequestBody CourseEntity newCourse){
        return courseService.creteCourse(newCourse);
    }

    @DeleteMapping("/{courseId}")
    public void deleteCourse(@PathVariable Long courseId){
        courseService.deleteCourse(courseId);
    }



}
