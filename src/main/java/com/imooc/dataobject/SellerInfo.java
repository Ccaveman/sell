package com.imooc.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @Author: Ccaveman
 * @Description:
 * @Date: Created in 12:55 2017/8/26
 */
@Data
@Entity
public class SellerInfo {

    @Id
    private String sellerId;

    private String Username;

    private String password;

    private String openid;
}
