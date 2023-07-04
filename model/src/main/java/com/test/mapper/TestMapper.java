package com.test.mapper;

import com.test.pojo.TestPojo;
import org.apache.ibatis.annotations.Mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

@Mapper
public interface TestMapper extends BaseMapper<TestPojo> {
}
