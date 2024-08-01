package com.example.sportclub.dtos;

import lombok.Data;

@Data
public class RoleGetDto {

    private Long user_role_id;
    private String role_name;

    public RoleGetDto(Long user_role_id, String role_name){
        this.user_role_id = user_role_id;
        this.role_name = role_name;
    }


}
