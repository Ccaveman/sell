package com.imooc.repository;

import com.imooc.dataobject.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

/**
 * @Author: Ccaveman
 * @Description:
 * @Date: Created in 12:38 2017/7/20
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoRepsoitoryTest {
    @Autowired
    private ProductInfoRepository repository;

    @Test
    public void  saveTest(){
        ProductInfo productInfo = new ProductInfo();

        productInfo.setProductId("1234567");
        productInfo.setProductName("兰州拉面");
        productInfo.setProductPrice(new BigDecimal(12.0));
        productInfo.setProductStock(100);
        productInfo.setProductDescription("非常好吃的拉面");
        productInfo.setProductIcon("http://XXX.jpg");
        productInfo.setProductStatus(0);
        productInfo.setCategoryType(3);
        ProductInfo info = repository.save(productInfo);
        Assert.assertNotNull(info);
    }

    @Test
    public void findByProductStatus() throws Exception {
        List<ProductInfo> productInfoList = repository.findByProductStatus(0);
        Assert.assertNotEquals(0,productInfoList.size());
    }

}