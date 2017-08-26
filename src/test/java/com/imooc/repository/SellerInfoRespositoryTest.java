package com.imooc.repository;

import com.imooc.dataobject.SellerInfo;
import com.imooc.utils.KeyUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: Ccaveman
 * @Description:
 * @Date: Created in 13:00 2017/8/26
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class SellerInfoRespositoryTest {

    @Autowired
    private SellerInfoRespository sellerInfoRespository;

    @Test
    public void save(){
        SellerInfo sellerInfo = new SellerInfo();

        sellerInfo.setSellerId(KeyUtil.genUniqueKey());
        sellerInfo.setOpenid("abc");
        sellerInfo.setUsername("admin");
        sellerInfo.setPassword("admin");

        SellerInfo result = sellerInfoRespository.save(sellerInfo);

        Assert.assertNotNull(result);
    }

    @Test
    public void findByOpenid()throws Exception{
        SellerInfo sellerInfo = sellerInfoRespository.findByOpenid("abc");
        Assert.assertEquals("abc",sellerInfo.getOpenid());
    }
}