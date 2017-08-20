package com.imooc.service.Impl;

import com.imooc.dto.OrderDTO;
import com.imooc.enums.ResultEnum;
import com.imooc.exception.SellException;
import com.imooc.service.BuyerService;
import com.imooc.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: Ccaveman
 * @Description: 买家service的实现类
 * @Date: Created in 0:06 2017/8/21
 */
@Service
@Slf4j
public class BuyerServiceImpl implements BuyerService {
    @Autowired
    private OrderService orderService;

    private OrderDTO checkOwner(String openid,String orderId){
        OrderDTO orderDTO = orderService.findOne(orderId);
        if (orderDTO==null)
            return null;
        if (!orderDTO.getBuyerOpenid().equalsIgnoreCase(openid)){
            log.error("【查询订单】订单的openid不一致 openid={}，orderDTO={}",openid,orderDTO);
            throw new SellException(ResultEnum.ORDER_OWNER_ERROR);
        }

        return orderDTO;
    }

    @Override
    public OrderDTO findOrderOne(String openid, String orderId) {

        return checkOwner(openid,orderId);
    }

    @Override
    public OrderDTO cancelOrder(String openid, String orderId) {
        OrderDTO orderDTO = checkOwner(openid, orderId);

        if (orderDTO == null) {
            log.error("【取消订单】查不到该订单，orderId={}",orderId);
            throw new SellException(ResultEnum.ORDER_NOT_EXIST);
        }
        return orderService.cancel(orderDTO);
    }
}
