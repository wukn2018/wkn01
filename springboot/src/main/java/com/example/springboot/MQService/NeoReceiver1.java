//package com.example.springboot.MQService;
//
///**
// *
// * @Author : Wukn
// * @Date : 2018/2/5
// */
//
//import com.alibaba.fastjson.JSON;
//import com.example.springboot.common.Queueame;
//import com.rabbitmq.client.Channel;
//import org.springframework.amqp.rabbit.annotation.RabbitHandler;
//import org.springframework.amqp.rabbit.annotation.RabbitListener;
//import org.springframework.stereotype.Component;
//
//@Component
//public class NeoReceiver1 {
//    /**
//     * 消费方法1
//     * @param neo
//     */
//    @RabbitListener(queues = Queueame.queueName)
//    @RabbitHandler
//    public void process(String neo , Channel channel) {
//        System.out.println("消费者------>1: " + JSON.parse( neo ));
//    }
//}
