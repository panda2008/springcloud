package com.pjq.serviceribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TestService {

    @Autowired
    private RestTemplate restTemplate;

    public String testHi(String name) {
        return restTemplate.getForObject("http://SERVICE-HI/hi/sayHi?name="+name,String.class);
    }

    public String testHello(String name) {
        return restTemplate.getForObject("http://SERVICE-HELLO/hello/sayHello?name="+name,String.class);
    }
}
