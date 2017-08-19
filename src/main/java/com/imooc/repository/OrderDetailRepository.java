package com.imooc.repository;

import com.imooc.dataobject.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author: Ccaveman
 * @Description: 商品订单详情
 * @Date: Created in 11:41 2017/8/19
 */
public interface OrderDetailRepository extends JpaRepository<OrderDetail,String>{

    List<OrderDetail> findByOrderId(String orderId);

}
