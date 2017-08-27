package com.imooc.service;

import com.imooc.dto.OrderDTO;

/**
 * @Author: Ccaveman
 * @Description: 推送消息
 * @Date: Created in 8:57 2017/8/27
 */
public interface PushMessage {

    /**
     * 订单状态变更消息
     * @param orderDTO
     */
    void orderStatus(OrderDTO orderDTO);
}
