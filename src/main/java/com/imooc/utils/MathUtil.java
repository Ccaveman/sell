package com.imooc.utils;

/**
 * @Author: Ccaveman
 * @Description: 用于比较价格是否相等的工具类
 * @Date: Created in 23:48 2017/8/22
 */
public class MathUtil {

    private static final Double MONEY_RANGE = 0.01;


    public static boolean equals(Double d1,Double d2){

        Double result = Math.abs(d1-d2);

        if (result<MONEY_RANGE){
            return true;
        }else {
            return false;
        }

    }
}
