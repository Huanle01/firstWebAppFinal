package com.t3h.firstWebApp.controller;


import lombok.extern.slf4j.Slf4j;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;


import java.util.Map;

@Slf4j
@Controller// nhan biet class nay la controller & la 1 bean
public class Demo2Controller {

    @GetMapping("/eportal/trades")
    public ModelAndView index(@RequestParam(required = false) String tradeId,
                              @RequestParam(required = false) Integer customerId
    ) {
        log.info("tradeId: {}", tradeId);
        log.info("customerId: {}", customerId);


        return null;
    }

    @GetMapping("/eportal/trades3/{tradeId}/{customerId}/{clientId}")
    public ModelAndView index2(@PathVariable String tradeId,
                               @PathVariable Integer customerId,
                               @PathVariable String clientId
    ) {
        log.info("tradeId: {}", tradeId);
        log.info("customerId: {}", customerId);
        log.info("clientId: {}", clientId);


        return null;
    }

    @GetMapping("/eportal/trades4")
    @ResponseBody
    public ResponseEntity<Map> index4() {
        return ResponseEntity.ok(Map.of(
                "page", 1,
                "toal", 12,
                "data", Map.of(
                        "id", 1,
                        "name", "t3h"
                )
        ));
    }

    @PostMapping("/eportal/trades2") // @PutMapping
    public ModelAndView index(@RequestParam(required = false) MultipartFile file,
                              @RequestParam(required = false) Integer customerId
    ) {
        log.info("file: {}", file);
        log.info("customerId: {}", customerId);


        return null;
    }
}