package com.t3h.firstWebApp.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller// nhan biet class nay la controller & la 1 bean
@Slf4j
public class Demo3Controller {
    @PostMapping("/demo-form") // @PutMapping
    @ResponseBody
    public ResponseEntity<String> index(
            String personName,
            String personAddress
    ) {
        log.info("personName: {}, personAddress: {}", personName, personAddress);

        return ResponseEntity.ok(String.format("personName: %s, personAddress: %s", personName, personAddress));
    }

    @PostMapping("/demo-form2") // @PutMapping
    @ResponseBody
    public ResponseEntity<Map> index2(
            String personName,
            String personAddress
    ) {
        log.info("personName: {}, personAddress: {}", personName, personAddress);
        return ResponseEntity.ok(
                Map.of("personName", personName,
                        "personAddress", personAddress));
    }

}