package com.example.sportclub.entities;


import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;

@Entity
@Table(name = "purchase_table")
@Data
public class PurchaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long purchase_id;


    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;

    @ManyToOne
    @JoinColumn(name = "course_bundle_id")
    private CourseBundleEntity courseBundle;



    private Timestamp purchase_date;


}
