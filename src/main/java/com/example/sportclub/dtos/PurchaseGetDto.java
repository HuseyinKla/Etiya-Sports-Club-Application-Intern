package com.example.sportclub.dtos;

import com.example.sportclub.entities.CourseBundleEntity;
import com.example.sportclub.entities.UserEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class PurchaseGetDto {

    private Long purchase_id;
    private Long user_id;
    private String user_name;
    private Long course_bundle_id;
    private String bundle_name;
    private int bundle_price;
    private Timestamp purchase_date;
}
