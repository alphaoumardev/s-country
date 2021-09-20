/*
  Created by:oumar
  Project:vue-boot
  Name:BaseEntity
  Date: 9/8/2021
  Time: 12:43 PM
*/
package com.alpha.vueboot.common.beans;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import java.io.Serializable;
import java.sql.Timestamp;

@Getter
@Setter
public class BaseEntity implements Serializable
{
    @Column(name= "is_delete" ,columnDefinition="bit default 0")
    private Boolean isDelete=false;

    @Column(name="crate_time")
    @CreationTimestamp
    private Timestamp createTime;

    @Column(name="crate_time")
    @UpdateTimestamp
    private Timestamp updateTime;

    public @interface update{}
}
