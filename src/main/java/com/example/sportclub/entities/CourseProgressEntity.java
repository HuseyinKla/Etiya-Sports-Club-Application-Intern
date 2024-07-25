package com.example.sportclub.entities;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "course_progress_table")
@Data
public class CourseProgressEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "course_progress_id")
    private Long course_progress_id;

    @Column(nullable = false)
    private int remaining_course;





    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "course_bundle_id")
    CourseBundleEntity course_bundle_table;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    UserEntity user_Entity_table;

}
