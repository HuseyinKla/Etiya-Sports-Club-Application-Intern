package com.example.sportclub.dtos;


import com.example.sportclub.entities.RoleEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserGetDto {

    private Long user_id;
    private String user_name;
    private String user_mail;
    private String role_name;
}
