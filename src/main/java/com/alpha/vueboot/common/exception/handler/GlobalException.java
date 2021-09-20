package com.alpha.vueboot.common.exception.handler;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
public class GlobalException
{
    public static Logger getLog() {
        return log;
    }

}
