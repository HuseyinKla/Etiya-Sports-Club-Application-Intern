package com.example.sportclub.services;

import com.example.sportclub.dtos.CourseGetDto;
import com.example.sportclub.entities.CourseEntity;
import com.example.sportclub.mappers.ICourseGetMapper;
import com.example.sportclub.repos.ICourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService {

    @Autowired
    private ICourseRepository courseRepository;

    public CourseService(ICourseRepository courseRepository){
        this.courseRepository = courseRepository;
    }


    public List<CourseGetDto> getAllCoursesDto() {
        List<CourseEntity> courses = courseRepository.findAll();
        return ICourseGetMapper.INSTANCE.coursestoCoursesGetDto(courses);
    }

    public CourseGetDto getOneCourseDto(Long courseId) {
        Optional<CourseEntity> optionalCourse = courseRepository.findById(courseId);
        if (optionalCourse.isPresent()){
            return ICourseGetMapper.INSTANCE.courseToCourseGetDto(optionalCourse.get());
        }else{
            throw new RuntimeException("Course not found");
        }

    }

    public CourseEntity creteCourse(CourseEntity newCourse) {
        return courseRepository.save(newCourse);
    }

    public void deleteCourse(Long courseId) {
        courseRepository.deleteById((courseId));
    }
}
