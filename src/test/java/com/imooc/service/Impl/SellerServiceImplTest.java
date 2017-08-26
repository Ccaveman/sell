package com.imooc.service.Impl;

import com.imooc.dataobject.SellerInfo;
import com.imooc.service.SellerService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: Ccaveman
 * @Description:
 * @Date: Created in 13:12 2017/8/26
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class SellerServiceImplTest {

    private static final String OPENID="abc";

    @Autowired
    private SellerService sellerService;

    @Test
    public void findSellerInfoByOpenid() throws Exception {

        SellerInfo result = sellerService.findSellerInfoByOpenid(OPENID);

        Assert.assertEquals(OPENID,result.getOpenid());
    }

}