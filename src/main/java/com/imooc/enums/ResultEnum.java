package com.imooc.enums;

import lombok.Getter;

/**
 * @Author: Ccaveman
 * @Description: 异常类枚举返回异常类型
 * @Date: Created in 13:49 2017/8/19
 */
@Getter
public enum ResultEnum {
    PRODUCT_NOT_EXIST(10,"商品不存在"),

    PRODUCT_STOCK_ERROR(11,"商品库存不正确"),

    ORDER_NOT_EXIST(12,"该订单不存在"),

    ORDER_DETAIL_NOT_EXIST(13,"该订单详情不存在"),

    ORDER_STATUS_ERROR(14,"该订单状态不正确"),

    ORDER_UPDATE_FAIL(15,"订单更新失败"),

    ORDER_DETAIL_EMPTY(16,"订单详情为空"),

    ORDER_PAY_STATUS_ERROR(17,"订单支付状态不正确"),


    ;

    private Integer code;

    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
