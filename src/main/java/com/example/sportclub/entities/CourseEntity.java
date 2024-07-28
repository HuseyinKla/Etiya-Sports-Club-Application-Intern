package com.example.sportclub.entities;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "course_table")
@Data
public class CourseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long course_id;

    @ManyToOne
    @JoinColumn(name = "course_bundle_id")
    private CourseBundleEntity courseBundle;

    private String course_name;
    private String course_description;
}
