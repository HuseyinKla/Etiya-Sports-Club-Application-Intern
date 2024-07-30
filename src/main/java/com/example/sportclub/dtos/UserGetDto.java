package com.example.sportclub.dtos;


import com.example.sportclub.entities.RoleEntity;
import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;

@Data
public class UserGetDto {

    private Long user_id; // dont send to client
    private String user_name;
    private String user_mail;
    private String user_password;
    private Timestamp created_at;
    private Long user_role_id;

    public UserGetDto(Long user_id, String user_name, String user_mail, String user_password, Timestamp created_at, Long user_role_id) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.user_mail = user_mail;
        this.user_password = user_password;
        this.created_at = created_at;
        this.user_role_id = user_role_id;
    }
}
