package com.example.sportclub.entities;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "role_table")
@Data
public class RoleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_role_id")
    private Long user_role_id;

    @Column(nullable = false)
    private int user_role;

    @Column(nullable = false)
    private String role_name;

    @Column(nullable = false)
    private boolean is_active;





}