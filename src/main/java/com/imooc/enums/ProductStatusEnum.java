package com.imooc.enums;

import lombok.Getter;

/**
 * @Author: Ccaveman
 * @Description: 商品状态的枚举类
 * @Date: Created in 13:22 2017/7/20
 */
@Getter
public enum ProductStatusEnum implements CodeEnum{
    UP(0,"在架"),
    DOWN(1,"下架");
    private  Integer code;

    private String message;
    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
