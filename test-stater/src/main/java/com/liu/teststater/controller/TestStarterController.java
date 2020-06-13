package com.liu.teststater.controller;

import com.liu.demo.AutoConfigurationService;
import com.liu.teststater.exception.MyException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @description:
 * @author: Jack.Cheng
 * @date: 2020/5/11 23:35
 **/
@RestController
public class TestStarterController {

    @Autowired
    private AutoConfigurationService autoConfigurationService;

    @GetMapping("/test")
    public String test(String msg,Integer num,@ModelAttribute("author")String author){
        if(num == null || num == 0){
            return autoConfigurationService.sayHello(" author:" + author + " msg:" + msg);
        }else{
            throw new MyException(HttpStatus.INTERNAL_SERVER_ERROR,"抛出了一个异常");
        }
    }
}
