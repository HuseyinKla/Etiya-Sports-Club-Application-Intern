package com.example.sportclub.entities;


import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Table(name = "role_table")
@Data
public class RoleEntity {

    /*@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_role_id")
    private Long user_role_id;*/

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long user_role_id;

    private int user_role;
    private String role_name;


    @Enumerated(EnumType.ORDINAL)
    private activity_status activity_status;

    public enum activity_status {
        DEACTIVE,
        ACTIVE
    }



    /*@OneToMany(mappedBy = "role")
    private Set<UserEntity> users;*/



}