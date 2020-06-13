package com.liu.demo;

/**
 * @description:
 * @author: Jack.Cheng
 * @date: 2020/5/11 23:17
 **/
public class AutoConfigurationService {

    // yml中的配置信息
    private AutoConfigureProperties autoConfigureProperties;

    public AutoConfigurationService(AutoConfigureProperties autoConfigureProperties) {
        this.autoConfigureProperties = autoConfigureProperties;
    }

    public String sayHello(String msg){
        return "姓名:" + autoConfigureProperties.getName() +
                " 年龄:" + autoConfigureProperties.getAge() +
                " 说:" + msg;
    }
}
