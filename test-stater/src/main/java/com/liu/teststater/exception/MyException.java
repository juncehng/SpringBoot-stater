package com.liu.teststater.exception;

import org.springframework.http.HttpStatus;

/**
 * @class: test-stater
 * @description:
 * @author: Jack.Cheng
 * @date: 2020/5/17 9:53
 * @menu: 自定义异常
 **/
public class MyException extends RuntimeException{
    private int code;
    private String msg;

    public MyException(HttpStatus status, String msg){
        super(msg);
        this.code = status.value();
        this.msg = msg;
    }

    public MyException(String msg){
        super(msg);
        this.code = HttpStatus.INTERNAL_SERVER_ERROR.value();
        this.msg = msg;
    }

    public MyException(HttpStatus status){
        super(status.getReasonPhrase());
        this.code = status.value();
        this.msg = status.getReasonPhrase();
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
