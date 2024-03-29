package com.example.logindemo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HelloController {
    @GetMapping("/")
    public String greeting(){
        return "Hello, World!";
    }

    @GetMapping("/secured")
    public String secure(){
        return "If you see this youre logged in";
    }
}
