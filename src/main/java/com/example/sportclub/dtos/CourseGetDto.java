package com.example.sportclub.dtos;


import com.example.sportclub.entities.CourseBundleEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseGetDto {

    private Long course_id;
    private Long course_bundle_id;
    private String bundle_name;
    private String course_name;
    private String course_description;

}
