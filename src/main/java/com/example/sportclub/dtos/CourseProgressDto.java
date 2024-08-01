package com.example.sportclub.dtos;


import com.example.sportclub.entities.CourseBundleEntity;
import com.example.sportclub.entities.UserEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseProgressDto {

    private Long course_progress_id;
    private Long user_id;
    private String user_name;
    private String bundle_name;
    private int remaining_course;

}
