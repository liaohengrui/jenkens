package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Demo class
 *
 * @author HengruiLiao
 * @date 2019/4/9
 */
@RestController
public class JenkinsTest {
    @GetMapping
    public String doGet() {
        return "Hello Jenkins";
    }
}
