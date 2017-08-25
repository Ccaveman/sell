package com.imooc.form;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @Author: Ccaveman
 * @Description: 表单提交的商品对象
 * @Date: Created in 0:48 2017/8/26
 */
@Data
public class ProductForm {

    private String productId;

    /*商品名称*/
    private  String productName;

    /*商品单价*/
    private BigDecimal productPrice;

    /*商品库存*/
    private Integer productStock;

    /*商品描述*/
    private String productDescription;

    /*商品小图*/
    private String productIcon;

    /*类目编号*/
    private Integer categoryType;
}
