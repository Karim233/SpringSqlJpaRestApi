package com.example.sprinsqljpaapi.binding;


import jakarta.persistence.*;
import lombok.Data;

;

//Create database and empty table
@Data
@Entity
@Table(name = "COURSE_DTLS")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
    private Integer cid;
    private String name;
    private Double price;
//    private Long id;

//    private int id;
//    @jakarta.persistence.Id
//    private Long id;

    }

