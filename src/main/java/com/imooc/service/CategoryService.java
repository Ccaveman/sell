package com.imooc.service;

import com.imooc.dataobject.ProductCategory;

import java.util.List;

/**
 * @Author: Ccaveman
 * @Description: 商品类目对应的service层
 * @Date: Created in 12:26 2017/7/20
 */
public interface CategoryService {

    /**
     * 根据商品ID查找商品
     * @param categoryId
     * @return 商品对应的对象
     */
    ProductCategory findOne(Integer categoryId);

    /**
     * 查找所有商品
     * @return 所有商品对象所组成的集合
     */
    List<ProductCategory> findAll();

    /**
     * 根据商品类目的ID来查找商品类目
     * @param categoryTypeList
     * @return
     */
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    /**
     * 新增和更新方法
     * @param productCategory
     * @return
     */
    ProductCategory save(ProductCategory productCategory);

}
