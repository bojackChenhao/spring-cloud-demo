package com.example.ranbbitproducer.sender;

import cn.hutool.log.Log;
import cn.hutool.log.LogFactory;
import com.example.ranbbitproducer.message.CmdMessage;
import com.example.ranbbitproducer.message.MsgStatus;
import org.springframework.amqp.rabbit.core.RabbitTemplate;

/**
 * @author chenHao
 * @Classname FileMessageSender
 * @Description TODO
 * @Date 2021/6/14 16:03
 */
public enum FileMessageSender implements IMessageSender{
    INST;
    private static final Log log = LogFactory.get();
    @Override
    public MsgStatus sendMsg(RabbitTemplate template, CmdMessage message) {
        return MsgStatus.HEAD_SUCCESS;
    }
}
