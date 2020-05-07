package com.goodyes.utils;

import com.goodyes.exception.DefaultException;
import org.apache.commons.lang3.ObjectUtils;

public class CommonUtil {

  public static void isNotNull(Object o) throws DefaultException {
    if (ObjectUtils.isEmpty(o)) {
      throw new DefaultException(String.format("参数对象为空！"));
    }
  }
}
