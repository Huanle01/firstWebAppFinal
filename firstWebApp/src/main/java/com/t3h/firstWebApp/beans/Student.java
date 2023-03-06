package com.t3h.firstWebApp.beans;

import lombok.Data;
import lombok.ToString;

import java.time.LocalDate;

@Data
@ToString
public class Student {
    private String name;
    private LocalDate birthDay;
}
