package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value = "/delegate")
public class DemoController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(path = "/demo")
    public String getDemoDelegate() {
        return this.restTemplate.getForObject("http://localhost:8800/demo", String.class);
    }
}
