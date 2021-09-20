/*
  Created by:oumar
  Project:vue-boot
  Name:BadRquest
  Date: 9/8/2021
  Time: 12:56 PM
*/
package com.alpha.vueboot.common.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

import static org.springframework.http.HttpStatus.BAD_REQUEST;

@Getter
public class BadRquest extends RuntimeException
{
    private Integer status = BAD_REQUEST.value();

    public BadRquest(HttpStatus  status, String message)
    {
        super(message);
        this.status = status.value();
    }

    public BadRquest(String message, Throwable cause, Integer status) {
        super(message, cause);
        this.status = status;
    }

    public BadRquest(String message, Integer status)
    {
        super(message);
        this.status = status;
    }
}
