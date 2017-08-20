package com.imooc.exception;

import com.imooc.enums.ResultEnum;

/**
 * @Author: Ccaveman
 * @Description: 自定义异常统一管理
 * @Date: Created in 13:48 2017/8/19
 */
public class SellException extends RuntimeException {

    private Integer code;

    public SellException(ResultEnum resultEnum){
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }

    public SellException(Integer code,String message){
        super(message);
        this.code = code;
    }
}
