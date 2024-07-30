package com.example.sportclub.mappers;

import com.example.sportclub.dtos.RoleGetDto;
import com.example.sportclub.entities.RoleEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface IRoleGetMapper {

    IRoleGetMapper INSTANCE = Mappers.getMapper(IRoleGetMapper.class);

    RoleGetDto roleToRoleGetDto(RoleEntity role);
    List<RoleGetDto> roleToRolesGetDto(List<RoleEntity> roles);
}
