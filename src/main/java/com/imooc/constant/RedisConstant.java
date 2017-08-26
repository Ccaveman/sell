package com.imooc.constant;

/**
 * @Author: Ccaveman
 * @Description: redis常量
 * @Date: Created in 18:01 2017/8/26
 */
public interface RedisConstant {

    String TOKEN_PREFIX = "token_%s";
    Integer EXPIRE = 7200;//过期时间2小时
}
