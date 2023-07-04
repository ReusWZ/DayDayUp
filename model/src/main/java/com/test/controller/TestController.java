package com.test.controller;

import com.test.pojo.TestPojo;
import com.test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/admin")
public class TestController {
    @Autowired
    private TestService testService;


    @GetMapping(value = "/getTest")
    public List<TestPojo> getTestList() {
        List<TestPojo> testList = testService.getTestList();
        return testList;
    }
}
