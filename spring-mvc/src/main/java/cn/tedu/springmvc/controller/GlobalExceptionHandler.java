package cn.tedu.springmvc.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @Classname: GlobalExceptionHandler
 * @Author: bromide
 * @CreateTime: 2022/5/27--14:22
 * @Version: V1.0
 * @Description:
 */
@RestControllerAdvice
public class GlobalExceptionHandler {


    @ExceptionHandler({NullPointerException.class,NumberFormatException.class})
    public String handleException(Throwable e){
        return "Error, "+e.getClass().getName()+",message :"+e.getMessage();
    }

    @ExceptionHandler(RuntimeException.class)
    public String handleRuntimeException(Throwable e){
        return "Error, RuntimeException";
    }

    @ExceptionHandler(Throwable.class)
    public String handleThrowable(Throwable e){
        return "Error:"+e.getClass().getName()+"message:"+e.getMessage();
    }
}
