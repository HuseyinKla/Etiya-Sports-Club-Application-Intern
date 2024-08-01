package com.example.sportclub.controllers;


import com.example.sportclub.dtos.CourseGetDto;
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
    public List<CourseGetDto> getAllCoursesDto(){
        return courseService.getAllCoursesDto();
    }

    @GetMapping("/{courseId}")
    public CourseGetDto getOneCourseDto(@PathVariable Long courseId){
        return courseService.getOneCourseDto(courseId);
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
