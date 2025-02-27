package com.example.sportclub.mappers;

import com.example.sportclub.dtos.LogGetDto;
import com.example.sportclub.entities.LogEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ILogGetMapper {

    ILogGetMapper INSTANCE = Mappers.getMapper(ILogGetMapper.class);


    @Mapping(source = "user.user_id", target = "user_id")
    LogGetDto logToGetLogDto(LogEntity log);
    List<LogGetDto> logToGetLogsDto(List<LogEntity> logs);

}
