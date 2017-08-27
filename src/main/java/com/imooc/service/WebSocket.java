package com.imooc.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * @Author: Ccaveman
 * @Description:
 * @Date: Created in 9:35 2017/8/27
 */
@Component
@ServerEndpoint("/webSocket")
@Slf4j
public class WebSocket {

    private Session session;

    private static CopyOnWriteArraySet<WebSocket> webSockets = new CopyOnWriteArraySet<>();

    @OnOpen
    public void opOpen(Session session){
        this.session = session;
        webSockets.add(this);
        log.info("【websocket】有新的连接，总数：{}",webSockets.size());
    }

    @OnMessage
    public void onClose(String message){
        log.info("【websocket消息】，收到客户端发来的消息：{}",message);
    }

    public void sendMessage(String message){
        for (WebSocket webSocket: webSockets) {
            log.info("【websocket消息】广播消息，message={}",message);
            try {
                webSocket.session.getBasicRemote().sendText(message);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
