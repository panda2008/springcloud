package com.pjq.servicehello.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/hello")
@RestController
public class HelloController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/sayHello")
    public String test(@RequestParam String name){
        return new StringBuffer().append("Hello ").append(name).append(",this port is ").append(port).append(".").toString();
    }
}
