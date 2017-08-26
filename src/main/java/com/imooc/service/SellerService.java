package com.imooc.service;

import com.imooc.dataobject.SellerInfo;

/**
 * @Author: Ccaveman
 * @Description: 卖家端service
 * @Date: Created in 13:08 2017/8/26
 */
public interface SellerService {

    /**
     * 通过openid查询卖家端信息
     * @param openid
     * @return
     */
    SellerInfo findSellerInfoByOpenid(String openid);
}
