package com.imooc.repository;

import com.imooc.dataobject.OrderDetail;
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
 * @Date: Created in 11:46 2017/8/19
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderDetailRepositoryTest {

    @Autowired
    private OrderDetailRepository respository;


    private static final String OPENID="1010100";

    @Test
    public void saveTest(){
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setDetailId("123456");
        orderDetail.setOrderId("111111");
        orderDetail.setProductId("11112");
        orderDetail.setProductName("皮蛋粥");
        orderDetail.setProductPrice(new BigDecimal(2.2));
        orderDetail.setProductIcon("http://xxxx.jpg");
        orderDetail.setProductQuantity(200);
        OrderDetail result = respository.save(orderDetail);
        Assert.assertNotNull(result);
    }

    @Test
    public void findByOrderId() throws Exception{
        List<OrderDetail> orderDetails = respository.findByOrderId("111111");

        Assert.assertNotEquals(0,orderDetails.size());
    }

}