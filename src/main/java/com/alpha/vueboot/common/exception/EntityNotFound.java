/*
  Created by:oumar
  Project:vue-boot
  Name:EntityNotFound
  Date: 9/8/2021
  Time: 1:11 PM
*/
package com.alpha.vueboot.common.exception;

public class EntityNotFound extends RuntimeException
{
    public EntityNotFound(String message, Throwable cause) {
        super(message, cause);
    }
}
