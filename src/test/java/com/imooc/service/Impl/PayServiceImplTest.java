package com.imooc.service.Impl;

import com.imooc.dto.OrderDTO;
import com.imooc.service.OrderService;
import com.imooc.service.PayService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: Ccaveman
 * @Description:
 * @Date: Created in 19:15 2017/8/22
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class PayServiceImplTest {
    @Autowired
    PayService payService;

    @Autowired
    OrderService orderService;

    @Test
    public void createTest(){
        OrderDTO orderDTO =orderService.findOne("1503229149946332855");
        payService.create(orderDTO);
    }
}