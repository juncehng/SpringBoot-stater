package com.liu.teststater.config;

import com.liu.teststater.exception.MyException;
import com.liu.teststater.result.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @class: test-stater
 * @description:
 * @author: Jack.Cheng
 * @date: 2020/5/17 9:52
 * @menu: 全局异常捕捉
 **/
@Slf4j
@RestControllerAdvice
public class ControllerAdviceCfg {

    /**
     * 应用到所有@RequestMapping注解方法，在其执行之前初始化数据绑定器
     */
    @InitBinder
    public void initBinder(WebDataBinder binder) {
        log.info("binder.getFieldDefaultPrefix {}",binder.getFieldDefaultPrefix());
        log.info("binder.getFieldMarkerPrefix {}",binder.getFieldMarkerPrefix());
    }

    /**
     * 把值绑定到Model中，使全局@RequestMapping可以获取到该值
     */
    @ModelAttribute
    public void addAttributes(Model model) {
        model.addAttribute("author", "jack.Cheng");
    }

    /**
     * 拦截自定义异常
     */
    @ExceptionHandler(value = MyException.class)
    public Result<String> failedRequest(MyException exception){
        log.error("拦截到异常，MSG:",exception);
        return Result.failed(exception.getMsg());
    }

}
