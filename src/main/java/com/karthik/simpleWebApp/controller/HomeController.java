package com.karthik.simpleWebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String greet() {
        return "hello world";
    }

    @RequestMapping("/about")
    public String about() {
        return "hello about here...";
    }
}
