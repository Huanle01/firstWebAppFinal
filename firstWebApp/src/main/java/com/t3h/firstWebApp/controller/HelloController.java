package com.t3h.firstWebApp.controller;

import com.t3h.firstWebApp.beans.Student;
import com.t3h.firstWebApp.storage.repository.ClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @Autowired
    Student student;
    @Autowired
    ClassRepository classRepository;

//    @GetMapping("/")
//    @ResponseBody
//    public String hello(){
//        return "hello world + " + student;
//    }
//
//
//
//    @GetMapping("/class")
//    @ResponseBody
//    public String findAll(){
//        return classRepository.findAll().toString();
//    }
}
