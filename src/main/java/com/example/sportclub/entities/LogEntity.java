package com.example.sportclub.entities;


import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;

@Entity
@Table(name = "log_table")
@Data
public class LogEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long log_id;


    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;


    private Timestamp log_date;
    private String action;
}
