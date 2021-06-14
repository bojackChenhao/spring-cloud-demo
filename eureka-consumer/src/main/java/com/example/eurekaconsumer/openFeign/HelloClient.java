package com.example.eurekaconsumer.openFeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "eureka-producer")
@RequestMapping(path = "/user")
public interface HelloClient {

    @RequestMapping("/sayHello")
    public String sayHello(@RequestParam("name") String name);
}
