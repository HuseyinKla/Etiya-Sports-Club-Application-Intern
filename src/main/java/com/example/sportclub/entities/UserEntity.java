
package com.example.sportclub.entities;


import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;

@Entity
@Table(name = "user_table")
@Data
public class UserEntity {


    /*@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private Long user_id;*/

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "userSeq")
    @SequenceGenerator(name = "userSeq", sequenceName = "userSeq", allocationSize = 1)
    private Long user_id;



    @Column(nullable = false)
    private String user_name;

    @Column(nullable = false)
    private String user_mail;

    @Column(nullable = false)
    private String user_password;

    @Column(nullable = false)
    private Long course_bundle_id;

    @Column(nullable = false)
    private Timestamp created_at;




    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_role_id")
    RoleEntity user_role_id;



}
