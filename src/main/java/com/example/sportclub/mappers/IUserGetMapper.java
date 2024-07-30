package com.example.sportclub.mappers;

import com.example.sportclub.dtos.UserGetDto;
import com.example.sportclub.entities.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface IUserGetMapper {

    IUserGetMapper INSTANCE = Mappers.getMapper(IUserGetMapper.class);


    @Mapping(source = "role.user_role_id", target = "user_role_id")
    UserGetDto userToUserGetDto(UserEntity user);
    List<UserGetDto> userToUsersGetDto(List<UserEntity> users);
}
