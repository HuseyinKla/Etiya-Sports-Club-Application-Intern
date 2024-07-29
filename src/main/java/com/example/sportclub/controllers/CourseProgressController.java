package com.example.sportclub.controllers;

import com.example.sportclub.entities.CourseProgressEntity;
import com.example.sportclub.services.CourseProgressService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/progress")
public class CourseProgressController {

    CourseProgressService courseProgressService;

    public CourseProgressController(CourseProgressService courseProgressService){
        this.courseProgressService = courseProgressService;
    }

    @GetMapping
    public List<CourseProgressEntity> getAllProgress(){
        return courseProgressService.getAllProgress();
    }

    @GetMapping("/{progressId}")
    public CourseProgressEntity getOneProgress(@PathVariable Long progressId){
        return courseProgressService.getOneProgress(progressId);
    }

    @PostMapping
    public CourseProgressEntity createProgress(@RequestBody CourseProgressEntity newProgress){
        return courseProgressService.createProgress(newProgress);
    }

    @PutMapping("/{progressId}")
    public CourseProgressEntity updateProgress(@PathVariable Long progressId, @RequestBody CourseProgressEntity newProgress){
        return courseProgressService.updateProgress(progressId, newProgress);
    }

    @DeleteMapping("/{progressId}")
    public void deleteProgress(@PathVariable Long progressId){
        courseProgressService.deleteProgress(progressId);
    }




}
