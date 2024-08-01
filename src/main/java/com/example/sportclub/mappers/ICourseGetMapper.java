package com.example.sportclub.mappers;

import com.example.sportclub.dtos.CourseGetDto;
import com.example.sportclub.entities.CourseEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ICourseGetMapper {

    ICourseGetMapper INSTANCE = Mappers.getMapper(ICourseGetMapper.class);

    @Mapping(source = "courseBundle.bundle_name", target = "bundle_name")
    @Mapping(source = "courseBundle.course_bundle_id", target = "course_bundle_id")
    CourseGetDto courseToCourseGetDto(CourseEntity course);
    List<CourseGetDto> coursestoCoursesGetDto(List<CourseEntity> courses);


}
