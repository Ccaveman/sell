package com.imooc.dataobject;

import com.imooc.enums.OrderStatusEnum;
import com.imooc.enums.PayStatusEnum;
import lombok.Data;
import org.hibernate.annotations.DynamicInsert;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @Author: Ccaveman
 * @Description: 买家订单实体类
 * @Date: Created in 11:10 2017/8/19
 */
@Entity
@DynamicInsert
@Data
public class OrderMaster {

    /*订单id*/
    @Id
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
}
