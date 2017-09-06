package com.imooc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

/**
 * @Author: Ccaveman
 * @Description: webSocket配置
 * @Date: Created in 9:34 2017/8/27
 */
public class WebSocketConfig {

    @Bean
    public ServerEndpointExporter serverEndpointExporter(){
        return new ServerEndpointExporter();
    }
}
