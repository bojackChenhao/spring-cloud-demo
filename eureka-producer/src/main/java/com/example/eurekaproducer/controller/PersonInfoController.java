package com.example.eurekaproducer.controller;


import com.example.eurekacommon.pojo.PersonInfo;
import com.example.eurekacommon.service.PersonInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author HQ
 * @since 2021-06-13
 */
@RestController
@RequestMapping("/personInfo")
public class PersonInfoController {

    @Autowired
    private PersonInfoService personInfoService;

    @RequestMapping("/getPersonInfo")
    public PersonInfo getPersonInfo(@RequestParam("id")int id){
        System.out.println(id);
        return personInfoService.getById(id);
    }

}

