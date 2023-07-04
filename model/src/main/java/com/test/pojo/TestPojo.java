package com.test.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("base_test")
public class TestPojo implements Serializable {
    @TableField("id")
    private int id;
    @TableField("name")
    private String name;
    @TableField("age")
    private int age;
}
