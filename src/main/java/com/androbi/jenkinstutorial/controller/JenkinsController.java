package com.androbi.jenkinstutorial.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("/jenkins")
public class JenkinsController {

    @GetMapping
    public String getJenkins() {
        return "Hello Jenkins!";
    }
}
