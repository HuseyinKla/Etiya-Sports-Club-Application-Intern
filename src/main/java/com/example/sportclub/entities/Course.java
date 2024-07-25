package com.example.sportclub.entities;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "course_table")
@Data
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "course_id")
    private Long course_id;

    @Column(nullable = false)
    private String course_name;

    @Column(nullable = false, columnDefinition = "text")
    private String course_description;





    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "course_bundle_id")
    CourseBundle course_bundle_table;
}
