package com.imooc.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @Author: Ccaveman
 * @Description: 商品(包含类目)
 * @Date: Created in 22:39 2017/7/20
 */
@Data
public class ProductVO implements Serializable {

    private static final long serialVersionUID = -3555231358992190972L;

    @JsonProperty("name")
    private String categoryName;

    @JsonProperty("type")
    private Integer categoryType;


    @JsonProperty("foods")
    private List<ProductInfoVO> productInfoVOList;
}
