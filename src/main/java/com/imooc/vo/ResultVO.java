package com.imooc.vo;

import lombok.Data;

/**
 * @Author: Ccaveman
 * @Description: http请求返回的最外层对象
 * @Date: Created in 16:04 2017/7/20
 */
@Data
public class ResultVO <T> {
    /*错误码*/
    private Integer code;
    /*提示信息*/
    private String msg;
    /*具体内容*/
    private T data;
}
