package com.t3h.firstWebApp.controller;

import com.t3h.firstWebApp.storage.entity.CustomClass;
import com.t3h.firstWebApp.storage.repository.ClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller// nhan biet class nay la controller & la 1 bean
public class DemoController {
    @Autowired
    private ClassRepository classRepository;

    @GetMapping( "/index")
    public ModelAndView index(){
        CustomClass customClass = classRepository.findById(10)
                .orElse(new CustomClass());
        List<CustomClass> customClassList =classRepository.findAll();
        ModelAndView dataViewTemplate = new ModelAndView("hello");
        dataViewTemplate.addObject("lop", customClass);

        dataViewTemplate.addObject("myname", "tomcat");
        dataViewTemplate.addObject("customClasses", customClassList);

        return dataViewTemplate;
    }
    @GetMapping("/index2")
    public ModelAndView index2(){

        ModelAndView dataViewTemplate = new ModelAndView("index2");
       return dataViewTemplate;
    };

}