package com.example.sportclub.mappers;

import com.example.sportclub.dtos.CourseBundleDto;
import com.example.sportclub.entities.CourseBundleEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface IBundleGetMapper {

    IBundleGetMapper INSTANCE = Mappers.getMapper(IBundleGetMapper.class);

    @Mapping(source = "user.user_id", target = "user_id")
    @Mapping(source = "user.user_name", target = "user_name")
    CourseBundleDto bundleToBundleDto(CourseBundleEntity bundle);
    List<CourseBundleDto> bundlestoBundlesGetDto(List<CourseBundleEntity> bundles);
}
