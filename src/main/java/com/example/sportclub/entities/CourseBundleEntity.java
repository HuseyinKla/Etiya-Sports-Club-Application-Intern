package com.example.sportclub.entities;


import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Table(name = "course_bundle_table")
@Data
public class CourseBundleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long course_bundle_id;

    /*@OneToMany(mappedBy = "courseBundle")
    private Set<UserEntity> users;*/

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private UserEntity user;


    private String bundle_name;
    private String bundle_description;
    private int bundle_price;
    private int total_lesson_number;



}
