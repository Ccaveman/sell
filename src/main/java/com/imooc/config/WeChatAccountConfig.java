package com.imooc.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Author: Ccaveman
 * @Description:
 * @Date: Created in 12:46 2017/8/21
 */
@Data
@Component
@ConfigurationProperties(prefix = "wechat")
public class WeChatAccountConfig {
    /*公众号appId*/
    private String mpAppId;

    /*公众号appServret*/
    private String mpAppSecret;

    /*商户号*/
    private String mchId;

    /*商户密钥*/
    private String mchKey;

    /*开放平台id*/
    private String openAppId;

    /*开放平台密钥*/
    private String openAppSecret;

    /*商户证书路径*/
    private String KeyPath;

    /*微信支付异步通知地址*/
    private String notifyUrl;
}
