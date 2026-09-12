package com.edu.aitutor.controller;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PwdTestController {
    private final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
    @GetMapping("/genPwd")
    public String gen(){
        return encoder.encode("123456");
    }
}
