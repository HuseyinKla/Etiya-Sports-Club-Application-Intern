package com.example.sportclub.entities;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "course_progress_table")
@Data
public class CourseProgress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "course_progress_id")
    private Long course_progress_id;

    @Column(nullable = false)
    private int remaining_course;





    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "course_bundle_id")
    CourseBundle course_bundle_table;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    User user_table;

}
