package com.t3h.firstWebApp;

import com.t3h.firstWebApp.beans.Student;
import com.t3h.firstWebApp.storage.entity.CustomClass;
import com.t3h.firstWebApp.storage.repository.ClassRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication

@Slf4j
public class FirstWebAppApplication implements CommandLineRunner {

    @Autowired
    Student student;

    @Autowired
    private ClassRepository classRepository;

    public static void main(String[] args) {
        SpringApplication.run(FirstWebAppApplication.class, args);

    }

    @Override
    public void run(String... args) {
        log.info("Printing Bean: {}", student);

        List<CustomClass> myClasses = classRepository.findAll();
        myClasses.forEach(mc -> {
            log.info("id: {}; Data:{}", mc.getId(), mc);
        });

    }
}
