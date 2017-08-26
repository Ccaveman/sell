package com.imooc.service.Impl;

import com.imooc.dataobject.SellerInfo;
import com.imooc.repository.SellerInfoRespository;
import com.imooc.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: Ccaveman
 * @Description: 卖家端用户service
 * @Date: Created in 13:11 2017/8/26
 */
@Service
public class SellerServiceImpl implements SellerService {

    @Autowired
    private SellerInfoRespository sellerInfoRespository;


    @Override
    public SellerInfo findSellerInfoByOpenid(String openid) {
        return sellerInfoRespository.findByOpenid(openid);
    }
}
