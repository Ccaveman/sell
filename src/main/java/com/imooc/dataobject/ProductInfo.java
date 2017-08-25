package com.imooc.dataobject;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.imooc.enums.ProductStatusEnum;
import com.imooc.utils.EnumUtil;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @Author: Ccaveman
 * @Description:  对应商品表的实体类
 * @Date: Created in 12:27 2017/7/20
 */
@Entity
@Data
@DynamicUpdate
public class ProductInfo {
    @Id
    private String productId;

    /*商品名称*/
    private  String productName;

    /*商品单价*/
    private BigDecimal productPrice;

    /*商品库存*/
    private Integer productStock;

    /*商品描述*/
    private String productDescription;

    /*商品小图*/
    private String productIcon;

    /*商品状态,0上架,1下架*/
    private Integer productStatus = ProductStatusEnum.UP.getCode();

    /*类目编号*/
    private Integer categoryType;

    /*创建时间*/
    private Date createTime;

    /*更新时间*/
    private Date updateTime;

    /*商品状态的枚举*/
    @JsonIgnore
    public ProductStatusEnum getProductStatusEnum(){
        return EnumUtil.getByCode(productStatus,ProductStatusEnum.class);
    }

}
