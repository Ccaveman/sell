package com.imooc.dataobject.mapper;

import com.imooc.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: Ccaveman
 * @Description:
 * @Date: Created in 15:16 2017/8/27
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class ProductCategoryMapperTest {

    @Autowired
    private ProductCategoryMapper mapper;

    @Test
    public void insertByMap() throws Exception {

        Map<String,Object> map = new HashMap<>();

        map.put("category_name","师兄最不爱");
        map.put("category_type",101);
        int result =  mapper.insertByMap(map);
        Assert.assertEquals(1,result);
    }

    @Test
    public void insertByObject(){
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryName("游戏必备");
        productCategory.setCategoryType(102);
        int insert = mapper.insertByObject(productCategory);
        Assert.assertEquals(1,insert);
    }

    @Test
    public void findByCategoryType(){
        ProductCategory categoryType = mapper.findByCategoryType(102);
        Assert.assertNotNull(categoryType);
    }

    @Test
    public void findByCategoryName(){
        List<ProductCategory> category = mapper.findByCategoryName("游戏必备");
        Assert.assertNotEquals(0,category);
    }

    @Test
    public  void  updateByCategoryType(){
        int i = mapper.updateByCategoryType("英雄联盟", 102);
        Assert.assertNotEquals(0,i);
    }

    @Test
    public  void  updateByObject(){
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryName("游戏必备");
        productCategory.setCategoryType(102);
        int i = mapper.updateByObject(productCategory);
        Assert.assertNotEquals(0,i);
    }

    @Test
    public void deleteByCategoryType(){
        int i = mapper.deleteByCategoryType(102);
        Assert.assertNotEquals(0,i);
    }

    @Test
    public void selectByCategoryType(){
        ProductCategory productCategory = mapper.selectByCategoryType(101);
        Assert.assertNotNull(productCategory);
    }

}