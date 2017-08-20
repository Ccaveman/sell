package com.imooc.dto;

import com.imooc.dataobject.OrderDetail;
import com.imooc.enums.OrderStatusEnum;
import com.imooc.enums.PayStatusEnum;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @Author: Ccaveman
 * @Description: 数据传输对象在各个层中用来传输数据的对象
 * @Date: Created in 13:34 2017/8/19
 */
@Data
public class OrderDTO {
    /*订单id*/
    private String orderId;

    /*买家用户名*/
    private String buyerName;

    /*买家电话*/
    private String buyerPhone;

    /*买家地址*/
    private String buyerAddress;

    /*买家微信id*/
    private String buyerOpenid;

    /*订单金额*/
    private BigDecimal orderAmount;

    /*订单状态，默认新订单*/
    private Integer orderStatus = OrderStatusEnum.NEW.getCode();

    /*支付状态，默认未支付*/
    private Integer payStatus = PayStatusEnum.WAIT.getCode();

    /*创建时间*/
    private Date createTime;

    /*更新时间*/
    private Date updateTime;

    /*订单详情*/
    List<OrderDetail> orderDetailList;
}
