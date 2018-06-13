package com.pjq.servicehi.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/hi")
@RestController
public class HiController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/sayHi")
    public String test(@RequestParam String name){
        return new StringBuffer().append("Hi ").append(name).append(",this port is ").append(port).append(".").toString();
    }
}
