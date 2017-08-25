package com.imooc.form;

import lombok.Data;

/**
 * @Author: Ccaveman
 * @Description: 表单提交的商品类目对象
 * @Date: Created in 2:05 2017/8/26
 */
@Data
public class CategoryForm {
    private Integer categoryId;

    /*类目名字*/
    private String categoryName;

    /*类目编号*/
    private Integer categoryType;
}
