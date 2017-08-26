package com.imooc.repository;

import com.imooc.dataobject.SellerInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: Ccaveman
 * @Description:
 * @Date: Created in 12:57 2017/8/26
 */
public interface SellerInfoRespository extends JpaRepository<SellerInfo,String>{
    SellerInfo findByOpenid(String openid);
}
