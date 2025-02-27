package com.example.sportclub.dtos;


import com.example.sportclub.entities.UserEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LogGetDto {

    private Long log_id;
    private Long user_id;
    private Timestamp log_date;
    private String action;


}
