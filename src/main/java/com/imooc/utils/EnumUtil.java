package com.imooc.utils;

import com.imooc.enums.CodeEnum;

/**
 * @Author: Ccaveman
 * @Description: 枚举的工具类
 * @Date: Created in 13:02 2017/8/24
 */
public class EnumUtil {

    public static <T extends CodeEnum> T  getByCode(Integer code, Class<T> enumClass){

        for (T each: enumClass.getEnumConstants()) {
            if (code.equals(each.getCode())){
                return each;
            }
        }
        return null;

    }
}
