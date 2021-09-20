/*
  Created by:oumar
  Project:vue-boot
  Name:EntityException
  Date: 9/8/2021
  Time: 1:07 PM
*/
package com.alpha.vueboot.common.exception;

public class EntityException extends RuntimeException
{
    public EntityException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace)
    {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
