/*
  Created by:oumar
  Project:vue-boot
  Name:Base
  Date: 9/8/2021
  Time: 12:40 PM
*/
package com.alpha.vueboot.common.beans;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.sql.Timestamp;

@Getter
@Setter
public class Base implements Serializable
{
    private Boolean isDelete;
    private Timestamp createTime;
    private Timestamp updateTime;

    @Override
    public String toString() {
        return "Base{" +
                "isDeleted=" + isDelete +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
