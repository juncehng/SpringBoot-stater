package com.liu.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description:
 * @author: Jack.Cheng
 * @date: 2020/5/11 23:05
 **/
@Configuration
@ConditionalOnWebApplication
// 将AutoConfigureProperties配置类装配到SpringIoc容器中
@EnableConfigurationProperties(AutoConfigureProperties.class)
public class AutoConfiguration {

    @Autowired
    private AutoConfigureProperties autoConfigureProperties;

    @Bean
    public AutoConfigurationService autoConfigurationService(){
        return new AutoConfigurationService(autoConfigureProperties);
    }
}
