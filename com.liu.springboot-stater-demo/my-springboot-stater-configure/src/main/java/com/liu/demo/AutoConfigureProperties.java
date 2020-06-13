package com.liu.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @description: 文件配置类
 * @author: Jack.Cheng
 * @date: 2020/5/11 22:58
 **/
@ConfigurationProperties(prefix = "jack.demo")
public class AutoConfigureProperties {

    private String name;

    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
