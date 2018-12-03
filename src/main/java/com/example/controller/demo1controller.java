package com.example.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableAutoConfiguration
@RequestMapping
@Controller
@RestController
public class demo1controller {

    @RequestMapping(value = "/hello")
    String hello() {
        return "hello springboot";
    }

    @RequestMapping(value = "/bye")
    String bye() {
        return "byebye";
    }

    @GetMapping(value = "/main")
    String main() {
        return "singlemonitorlogin";
    }

    @RequestMapping("index")
    String index() {
        return "home";
    }

    @RequestMapping(value = "/1")
    int one() {
        return 1;
    }
}
