package com.example.ranbbitproducer.message;

import org.beetl.sql.core.annotatoin.EnumMapping;

/**
 * @author fyin
 */
@EnumMapping("value")
public enum MsgStatus {
    /**
     * 消息初始状态,未发送
     */
    INIT(0),
    /**
     * 消息已经发出
     */
    SEND_OUT(2),
    /**
     * 消息发送成功
     */
    SUCCESS(1),
    /**
     * 消息发送出错
     */
    ERROR(-1),
    /**
     * 消息发送失败,不会再重试了
     */
    FAILED(100),
    /**
     * 消息块发送失败
     */
    HEAD_ERROR(-3),
    /**
     * 消息块发送完成
     */
    HEAD_SUCCESS(3),
    /**
     * 文件块正在传输
     */
    BLOCK_RECEIVEING(4),
    /**
     * 文件块传输中断(文件监视器指定时间内没有检测到文件矩阵信息发生变化)
     */
    BLOCK_INTERRUPT(-4),
    /**
     * 消息块发送失败
     */
    BLOCK_ERROR(-5),
    /**
     * 消息块发送完成
     */
    BLOCK_SUCCESS(5),
    /**
     * 消息发送完成,接收端后续处理失败
     */
    RECEIVED_HANDLER_ERROR(-6),
    /**
     * 消息发送完成,发送端后续处理失败
     */
    SENDED_HANDLER_ERROR(-7),
    /**
     * 未处理,发送方未发送,或者接收方未成功找到消息的处理类
     */
    UNDEAL(-99),
    /**
     *
     */
    ;
    private int value;

    MsgStatus(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
