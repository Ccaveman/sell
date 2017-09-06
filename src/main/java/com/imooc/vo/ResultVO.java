package com.imooc.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: Ccaveman
 * @Description: http请求返回的最外层对象
 * @Date: Created in 16:04 2017/7/20
 */
@Data
public class ResultVO <T> implements Serializable{
    private static final long serialVersionUID = -8349181922768084604L;

    /*错误码*/
    private Integer code;
    /*提示信息*/
    private String msg;
    /*具体内容*/
    private T data;
}
