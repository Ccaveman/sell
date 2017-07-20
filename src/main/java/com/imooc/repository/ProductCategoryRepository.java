package com.imooc.repository;

import com.imooc.dataobject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author: Ccaveman
 * @Description: 商品类目信息对应的Dao层
 * @Date: Created in 12:29 2017/7/20
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory,Integer>{
    /**
     * 根据商品类目的ID来查找商品
     * @param categoryTypeList
     * @return
     */
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
