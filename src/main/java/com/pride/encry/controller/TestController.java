package com.pride.encry.controller;

import com.pride.encry.service.TestService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TestController {
    @Resource
    private TestService testService;

    @RequestMapping("/hello")
    public String hello() {
        testService.test();
        return "Hello SpringBoot!";
    }

    @RequestMapping("/dtoTest")
    public String dtoTest() {
        testService.dtoTest();
        return "SpringBoot dtoTest!";
    }
}
