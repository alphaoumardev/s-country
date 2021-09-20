/*
  Created by:oumar
  Project:vue-boot
  Name:BaseMapper
  Date: 9/8/2021
  Time: 12:51 PM
*/
package com.alpha.vueboot.common.beans;

import java.util.List;

public interface BaseMapper<D,E>
{
   E toEntity(D dto);
   D toDto(D entity);

   List<E> toEntity(List<D> toDto);
   List<D> toDto(List<E> entity);


}
