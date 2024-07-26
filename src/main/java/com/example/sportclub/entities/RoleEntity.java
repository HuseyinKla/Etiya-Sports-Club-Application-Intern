package com.example.sportclub.entities;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "role_table")
@Data
public class RoleEntity {

    /*@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_role_id")
    private Long user_role_id;*/

    //her entity için unique yap
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "project_seq")
    @SequenceGenerator(name = "project_seq", sequenceName = "project_seq", allocationSize = 1)
    private Long user_role_id;

    @Column(nullable = false)
    private int user_role;

    @Column(nullable = false)
    private String role_name;

    @Column(nullable = false)
    private boolean is_active;





}