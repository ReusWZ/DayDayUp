package com.test.service.impl;

import com.test.mapper.TestMapper;
import com.test.pojo.TestPojo;
import com.test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestMapper testMapper;

    @Override
    public List<TestPojo> getTestList() {
        List<TestPojo> testPojos = testMapper.selectList(null);
        return testPojos;
    }
}
