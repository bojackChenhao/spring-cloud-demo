package com.example.eurekaconsumer.business;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author chenHao
 * @Classname OrderBusiness
 * @Description TODO
 * @Date 2021/6/14 15:20
 */

@Component
public class OrderBusiness {

    @RabbitListener(queues = "topic.order")
    public void process1(String orderId) {
        System.out.println(System.currentTimeMillis() + "====Receive from topic.order orderId is========:" + orderId);
    }

}
