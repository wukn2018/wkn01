package com.example.springboot.MQService.receiver;
import com.alibaba.fastjson.JSON;
import com.example.springboot.pojo.User;
import com.rabbitmq.client.Channel;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 *
 * @Author : Wukn
 * @Date : 2018/2/5
 */
@Component
public class NeoReceiver22 {

    /**
     * 消费方法2
     * @param neo
     */
    @RabbitListener(queues = "topic.messages")
    @RabbitHandler
     public void process( String neo ) {
                 System.out.println("消费者------->2: " +neo);
             }










}
