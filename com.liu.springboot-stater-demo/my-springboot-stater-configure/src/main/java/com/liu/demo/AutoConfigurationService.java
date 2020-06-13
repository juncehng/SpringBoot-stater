package com.liu.demo;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @description:
 * @author: Jack.Cheng
 * @date: 2020/5/11 23:17
 **/
public class AutoConfigurationService {

    // yml中的配置信息
    @Autowired
    private AutoConfigureProperties autoConfigureProperties;

    public String sayHello(String msg){
        return "姓名:" + autoConfigureProperties.getName() +
                " 年龄:" + autoConfigureProperties.getAge() +
                " 说:" + msg;
    }
}
