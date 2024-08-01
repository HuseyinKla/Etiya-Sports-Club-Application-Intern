package com.example.sportclub.dtos;

import com.example.sportclub.entities.UserEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseBundleDto {


    private Long course_bundle_id;
    private Long user_id;
    private String user_name;
    private String bundle_name;
    private String bundle_description;
    private int bundle_price;
    private int total_lesson_number;

}
