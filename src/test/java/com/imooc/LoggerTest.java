package com.imooc;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Administrator on 2017/7/19.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
public class LoggerTest {
    //private final Logger logger = LoggerFactory.getLogger(LoggerTest2.class);//当前类

    @Test
    public void test1(){

        /*logger.debug("debug...");
        logger.info("info...");
        logger.error("error..");*/
        String name = "imooc";
        String password = "123456";
        log.debug("debug...");
        log.info("name:{},password:{}",name,password);
        log.error("error..");
    }
}
