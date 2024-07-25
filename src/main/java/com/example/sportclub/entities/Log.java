package com.example.sportclub.entities;


import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;

@Entity
@Table(name = "log_table")
@Data
public class Log {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "log_id")
    private Long log_id;

    @Column(nullable = false)
    private Timestamp log_date;

    @Column(nullable = false)
    private String action;



    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    User user_table;

}
