package com.example.eurekaconsumer.controller;

import com.example.eurekacommon.pojo.PersonInfo;
import com.example.eurekaconsumer.openFeign.HelloClient;
import com.example.eurekaconsumer.openFeign.PersonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(path = "/hello")
public class HelloController {
    @Autowired
    RestTemplate restTemplate;

    @Autowired
    private HelloClient helloClient;

    @Autowired
    private PersonClient personClient;

    @RequestMapping("/sayHello")
    public String sayHello(String name){
        return helloClient.sayHello(name);
    }

    @RequestMapping("/getPersonInfo")
    public PersonInfo getPersonInfo(int id){
        return personClient.getPersonInfo(id);
    }

}
