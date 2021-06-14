package com.example.ranbbitproducer;

import com.example.ranbbitproducer.sender.RabbitSender;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SpringBootTest(classes = RabbitProducerApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
class RabbitProducerApplicationTests {
    @Autowired
    private RabbitSender rabbitSender;

    @Test
    public void contextLoads() {
        String exchange = "exchange";
        String queueName = "topic.order";
        String orderId = "123456";
        rabbitSender.sendTopic(exchange,queueName,orderId);
    }

    @Test
    public void testRabbitObject() {
        String exchange = "exchange";
        String queueName = "topic.order";
        String orderId = "123456";
        rabbitSender.sendTopic(exchange,queueName,orderId);
    }

}
