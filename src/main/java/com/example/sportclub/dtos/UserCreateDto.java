package com.example.sportclub.dtos;


import lombok.Data;

import java.sql.Timestamp;

@Data
public class UserCreateDto {

    Long user_id;
    String user_name;
    String user_mail;
    String user_password;
    Long role_id;
    Timestamp created_at;

}
