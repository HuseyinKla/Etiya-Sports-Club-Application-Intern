package com.example.sportclub.mappers;


import com.example.sportclub.dtos.CourseProgressDto;
import com.example.sportclub.entities.CourseProgressEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface IProgressGetMapper {

    IProgressGetMapper INSTANCE = Mappers.getMapper(IProgressGetMapper.class);

    @Mapping(source = "courseBundle.bundle_name", target = "bundle_name")
    @Mapping(source = "user.user_name", target = "user_name")
    @Mapping(source = "user.user_id", target = "user_id")
    CourseProgressDto progresstoGetProgressDto(CourseProgressEntity progress);
    List<CourseProgressDto> progresstoGetAllProgressDto(List<CourseProgressEntity> progresses);
}
