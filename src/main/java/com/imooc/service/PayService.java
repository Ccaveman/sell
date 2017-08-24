package com.imooc.service;

import com.imooc.dto.OrderDTO;
import com.lly835.bestpay.model.PayResponse;
import com.lly835.bestpay.model.RefundResponse;

/**
 * @Author: Ccaveman
 * @Description: 支付接口
 * @Date: Created in 17:44 2017/8/21
 */
public interface PayService {

    /**
     * 支付订单
     * @param orderDTO
     */
    PayResponse create(OrderDTO orderDTO);

    /**
     * 微信支付的异步通知
     * @param notifyData
     */
    PayResponse notify(String notifyData);

    /**
     * 微信退款
     */
    RefundResponse refund(OrderDTO orderDTO);
}
