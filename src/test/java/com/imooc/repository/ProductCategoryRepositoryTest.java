package com.imooc.repository;

import com.imooc.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {
    @Autowired
    private ProductCategoryRepository repository;

    @Test
    public void findOneTest(){
        ProductCategory repositoryOne = repository.findOne(1);
        System.out.println(repositoryOne.toString());
    }

    @Test
    @Transactional //操作完成之后进行事务回滚
    public void saveTest(){
        ProductCategory productCategory = new ProductCategory("女生最爱",4);
        /*productCategory.setCategoryId(3);
        productCategory.setCategoryName("男生最爱");
        productCategory.setCategoryType(3);*/
        ProductCategory result = repository.save(productCategory);

        Assert.assertNotEquals(null,result);
    }

    @Test
    public  void  findByCategoryTypeInTest(){
        List<Integer> list = Arrays.asList(2,3,4);
        List<ProductCategory> result = repository.findByCategoryTypeIn(list);
        Assert.assertNotEquals(0,result.size());
    }
}