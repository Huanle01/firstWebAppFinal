package com.t3h.firstWebApp.controller;

import com.t3h.firstWebApp.storage.dto.LoginFormbt;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller// nhan biet class nay la controller & la 1 bean
@Slf4j
public class DemoLoginFormbt {
    @PostMapping("/api/login1") // @PutMapping
    @ResponseBody
    public ResponseEntity<LoginFormbt> login(
            @RequestBody LoginFormbt loginFormbt // hung data tu form, content-type json
    ) {
        log.info("LoginForm: {}", loginFormbt);

        return ResponseEntity.ok(loginFormbt);
    }
}
