package com.liu.teststater.result;

import lombok.Data;

import java.io.Serializable;

@Data
public class Result<T> implements Serializable {
    //结果状态  true：成功   false：失败
    private boolean resultStatus;
    //状态码
    private String resultCode;
    //结果对象
    private T result;

    //返回成功信息
    public static <T> Result<T> ok() {
        Result<T> result = new Result<T>();
        result.setResultStatus(true);
        result.setResultCode("success");
        return result;
    }

    public static <T> Result<T> ok(T object) {
        Result<T> result = new Result<T>();
        result.setResultStatus(true);
        result.setResultCode("success");
        result.setResult(object);
        return result;
    }

    //返回信息失败
    public static <T> Result<T> failed(T result) {
        Result<T> resultObject = new Result<T>();
        resultObject.setResultStatus(false);
        resultObject.setResultCode("failed");
        resultObject.setResult(result);
        return resultObject;
    }
}
