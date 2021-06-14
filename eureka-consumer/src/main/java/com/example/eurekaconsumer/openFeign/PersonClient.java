package com.example.eurekaconsumer.openFeign;

import com.example.eurekacommon.pojo.PersonInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author chenHao
 * @Classname PersonClient
 * @Description TODO
 * @Date 2021/6/13 23:18
 */
@FeignClient(value = "eureka-producer")
@RequestMapping(path = "/personInfo")
public interface PersonClient {
    @RequestMapping("/getPersonInfo")
    public PersonInfo getPersonInfo(@RequestParam("id") int id);
}
