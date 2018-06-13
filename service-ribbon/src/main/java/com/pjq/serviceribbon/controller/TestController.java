package com.pjq.serviceribbon.controller;

import com.pjq.serviceribbon.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/test")
@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping("/testHi")
    public String testHi(@RequestParam String name){
        return testService.testHi(name);
    }

    @RequestMapping("/testHello")
    public String testHello(@RequestParam String name){
        return testService.testHello(name);
    }
}

