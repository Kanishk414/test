package com.mycompany.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyTestController {
    @GetMapping("/getResource")
    public String getResource() {
        return "Hello World";
    }

    @PostMapping("/getResource")
    public String postResource() {
        return "post method example";
    }

}
