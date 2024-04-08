package com.androbi.jenkinstutorial.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JenkinsServiceTest {

    private JenkinsService jenkinsService;

    @BeforeEach
    public void setUp() {
        jenkinsService = new JenkinsServiceImpl();
    }

    @Test
    public void getJenkinsReturnsExpectedMessage() {
        String expectedMessage = "Hello Jenkins!";
        String actualMessage = jenkinsService.getJenkins();

        assertEquals(expectedMessage, actualMessage);
    }
}
