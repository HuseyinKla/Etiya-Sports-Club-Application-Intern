package com.example.sportclub.entities;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "course_bundle_table")
@Data
public class CourseBundle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "course_bundle_id")
    private Long course_bundle_id;

    @Column(nullable = false)
    private String bundle_name;

    @Column(nullable = false, columnDefinition = "text")
    private String bundle_description;

    @Column(nullable = false)
    private int bundle_price;

    @Column(nullable = false)
    private int total_lesson_number;



}
