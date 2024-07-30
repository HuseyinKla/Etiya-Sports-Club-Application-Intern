package com.example.sportclub.dtos;

import lombok.Data;

@Data
public class RoleGetDto {

    private Long user_role_id;
    private int user_role;
    private String role_name;

    public RoleGetDto(Long user_role_id, int user_role, String role_name){
        this.user_role_id = user_role_id;
        this.user_role = user_role;
        this.role_name = role_name;
    }


}
