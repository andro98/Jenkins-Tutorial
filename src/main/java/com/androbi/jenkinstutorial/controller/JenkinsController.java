package com.androbi.jenkinstutorial.controller;


import com.androbi.jenkinstutorial.service.JenkinsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@AllArgsConstructor
@Controller("/jenkins")
public class JenkinsController {

    private final JenkinsService jenkinsService;
    // Test on adding a new change
    @GetMapping
    public String getJenkins() {
        return jenkinsService.getJenkins();
    }
}
