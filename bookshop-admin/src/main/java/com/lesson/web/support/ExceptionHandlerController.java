package com.lesson.web.support;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandlerController {

    @ExceptionHandler(RuntimeException.class)
    public Map<String,Object> handleException(RuntimeException exception){
        Map<String,Object> result = new HashMap<String,Object>();
        result.put("success", "false12312");
        result.put("errMsg", exception.getMessage());
        return result;
    }
}
