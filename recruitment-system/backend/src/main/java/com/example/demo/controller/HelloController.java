package com.example.demo.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/api/hello")
@RequiredArgsConstructor
public class HelloController {
    @GetMapping("")
    public String hello() {
        log.info("hello");
        return "Hello World";
    }
}
