package com.imooc.enums;

import lombok.Getter;

/**
 * @Author: Ccaveman
 * @Description:
 * @Date: Created in 11:14 2017/8/19
 */
@Getter
public enum OrderStatusEnum implements CodeEnum{

    NEW(0,"新订单"),

    FINISHED(1,"完结"),

    CANCEL(2,"已取消");

    private Integer code;

    private String message;

    OrderStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
