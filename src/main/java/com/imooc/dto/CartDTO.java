package com.imooc.dto;

import lombok.Data;

/**
 * @Author: Ccaveman
 * @Description:
 * @Date: Created in 14:23 2017/8/19
 */
@Data
public class CartDTO {
    /*商品id*/
    private String productId;

    /*商品数量*/
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
