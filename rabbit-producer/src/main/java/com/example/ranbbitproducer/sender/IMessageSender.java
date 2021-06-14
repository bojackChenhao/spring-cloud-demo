package com.example.ranbbitproducer.sender;

import com.example.ranbbitproducer.message.CmdMessage;
import com.example.ranbbitproducer.message.MsgStatus;
import org.springframework.amqp.rabbit.core.RabbitTemplate;

/**
 * @author chenHao
 * @Classname IMessageSender
 * @Description TODO
 * @Date 2021/6/14 16:14
 */
public interface IMessageSender {
    MsgStatus sendMsg(RabbitTemplate template, CmdMessage msg);

}
