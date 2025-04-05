package com.will.exception.handler;

import com.will.common.Result;
import com.will.common.ResultCodeEnum;
import com.will.exception.BusinessException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @program: GenBI
 * @description: 全局异常处理类
 * @author: Mr.Zhang
 * @create: 2025-04-05 00:10
 **/

@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {
    /*
    * 业务异常处理
    * */
    @ExceptionHandler(BusinessException.class)
    public Result<String> handlerBusinessException(BusinessException e) {
        log.error("业务异常：{}", e.getMessage());
        return Result.build(null, e.getCode(), e.getMessage());
    }

    /*
    * 运行异常处理
    * */
    @ExceptionHandler(RuntimeException.class)
    public Result<String> handlerRuntimeException(RuntimeException e) {
        log.error("错误：{}", e.getMessage());
        return Result.build(null, ResultCodeEnum.SYSTEM_ERROR);
    }
}
