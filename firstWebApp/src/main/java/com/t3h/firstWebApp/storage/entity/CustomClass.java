package com.t3h.firstWebApp.storage.entity;

import jakarta.persistence.*;
import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "lop")
public class CustomClass {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
//    @Column(name = "birthDay")
    private LocalDate birthDay;
//    @Column(name = "birthDayTime")
    private LocalTime birtHDayTime;
//    @Column(name = "fullBirthDay")
    private LocalDateTime fullBirthDay;
}
