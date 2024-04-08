package com.androbi.jenkinstutorial.service;

import org.springframework.stereotype.Service;

@Service
public class JenkinsServiceImpl implements JenkinsService {
    @Override
    public String getJenkins() {
        return "Hello Jenkins!";
    }
}
