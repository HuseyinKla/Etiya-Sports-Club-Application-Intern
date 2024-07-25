package com.example.sportclub.entities;


import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;

@Entity
@Table(name = "purchase_table")
@Data
public class Purchase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "purchase_id")
    private Long purchase_id;

    @Column(nullable = false)
    private Timestamp purchase_date;



    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    User user_table;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "course_bundle_id")
    CourseBundle course_bundle_table;

}
