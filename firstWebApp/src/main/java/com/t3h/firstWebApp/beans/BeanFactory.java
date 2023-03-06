package com.t3h.firstWebApp.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;

@Configuration
public class BeanFactory {

   @Bean
    public Student createStudent(){
        Student student = new Student();
        student.setName("Hoang");
        student.setBirthDay(LocalDate.now());
        return student;
    }
}
