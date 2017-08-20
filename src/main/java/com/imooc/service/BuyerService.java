package com.imooc.service;

import com.imooc.dto.OrderDTO;

/**
 * @Author: Ccaveman
 * @Description: 买家service处理openid 的调用问题
 * @Date: Created in 0:00 2017/8/21
 */
public interface BuyerService {

    /**
     * 查询一个订单
     * @param openid 买家openid
     * @param orderId 订单id
     * @return
     */
    OrderDTO findOrderOne(String openid, String orderId);

    /**
     * 取消订单
     * @param openid 买家openid
     * @param orderId 订单id
     * @return
     */
    OrderDTO cancelOrder(String openid, String orderId);

}
