
package com.example.sportclub.entities;


import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "user_table")
@Data
public class UserEntity {


    /*@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private Long user_id;*/

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long user_id;

    /*@ManyToOne
    @JoinColumn(name = "course_bundle_id", nullable = false)
    private CourseBundleEntity courseBundle;*/

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_role_id", nullable = false)
    private RoleEntity role;


    private String user_name;
    private String user_mail;
    private String user_password;
    private Timestamp created_at;

    /*@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<LogEntity> logs = new ArrayList<LogEntity>();*/


}
