package com.example.eurekaproducer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/user")
public class TestController {

    @RequestMapping("/sayHello")
    public String sayHello(@RequestParam("name") String name){
        System.out.println("调用生产者");
        return "hello " + name ;
    }

    public static void main(String[] args) {
        System.out.println(1);
    }

}
