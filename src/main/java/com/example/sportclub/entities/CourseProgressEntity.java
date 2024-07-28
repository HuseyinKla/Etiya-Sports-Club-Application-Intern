package com.example.sportclub.entities;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "course_progress_table")
@Data
public class CourseProgressEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long course_progress_id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;

    @ManyToOne
    @JoinColumn(name = "course_bundle_id")
    private CourseBundleEntity courseBundle;


    private int remaining_course;
}
