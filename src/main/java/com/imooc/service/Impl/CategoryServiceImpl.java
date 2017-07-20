package com.imooc.service.Impl;

import com.imooc.dataobject.ProductCategory;
import com.imooc.repository.ProductCategoryRepository;
import com.imooc.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Ccaveman
 * @Description: 商品类目对应的service层
 * @Date: Created in 12:28 2017/7/20
 */
@Service
public class CategoryServiceImpl implements CategoryService{
    @Autowired
    private ProductCategoryRepository repository;

    /**
     * 根据商品ID查找商品
     * @param categoryId
     * @return 商品对应的对象
     */
    @Override
    public ProductCategory findOne(Integer categoryId) {
        return repository.findOne(categoryId);
    }

    /**
     * 查找所有商品
     * @return 所有商品对象所组成的集合
     */
    @Override
    public List<ProductCategory> findAll() {
        return repository.findAll();
    }

    /**
     * 根据商品类目的ID来查找商品类目
     * @param categoryTypeList
     * @return
     */
    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList) {
        return repository.findByCategoryTypeIn(categoryTypeList);
    }

    /**
     * 保存或者更新到数据库对应的商品类目对象
     * @param productCategory
     * @return 商品类目对象
     */
    @Override
    public ProductCategory save(ProductCategory productCategory) {
        return repository.save(productCategory);
    }
}
