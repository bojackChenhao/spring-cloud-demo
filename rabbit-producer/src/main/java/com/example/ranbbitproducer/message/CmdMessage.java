package com.example.ranbbitproducer.message;


import cn.hutool.core.util.StrUtil;

import java.io.Serializable;

//import com.kdgcsoft.sc.rdc.messenger.model.MessageTrace;

/**
 * @Author by fyin.
 * @date 2018/06/06.
 * @description 基础消息类, 所有消息的传输均使用该类进行传输
 */
public class CmdMessage implements Serializable {
//    private MessageTrace messageTrace;
    private String messageId;
    private String groupMessageId;
    private String command;
//    private MessageType messageType;
    private String queueName;
    private Object body;
    /**
     * 消息优先级,默认为0
     */
    private int priority = 0;
    /**
     * 默认消息是需要存储的,不包含RPC消息
     */
    private boolean store = true;
    /**
     * 默认超时时间为30s;
     */
    private Long rpcTimeOut = 30000L;
    
    /**
     * 是否为回复消息
     */
    private boolean isReply;
    
    /**
     * 回复的消息ID
     */
    private String replyMessageId;
    
    public CmdMessage() {
    }

    public CmdMessage(String messageId) {
        this.messageId = messageId;
    }
    
//    public CmdMessage(String command, MessageTrace messageTrace) {
//        this.messageTrace = messageTrace;
//        this.command = command;
//    }
    

    
    public String getMessageId() {
        return messageId;
    }
    
    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }
    
    public String getCommand() {
        return command;
    }
    
    public void setCommand(String command) {
        this.command = command;
    }
    
    public String getQueueName() {
        return queueName;
    }
    
    public void setQueueName(String queueName) {
        this.queueName = queueName;
    }
    
    public Object getBody() {
        return body;
    }
    
    public void setBody(Object body) {
        this.body = body;
    }
    
    

    
    public String getGroupMessageId() {
        return groupMessageId;
    }
    
    public void setGroupMessageId(String groupMessageId) {
        this.groupMessageId = groupMessageId;
    }
    
    public boolean isStore() {
        return store;
    }
    
    public void setStore(boolean store) {
        this.store = store;
    }
    
    @Override
    public String toString() {
        return "CmdMessage{" + " messageId='" + messageId + '\'' + ", groupMessageId='" + groupMessageId + '\'' + ", command='" + command + '\'' + ", queueName='" + queueName + '\'' + '\'' + ", store=" + store + '}';
    }
    
    public String getBaseInfo() {
        return StrUtil.format("[{}][{}][{}]", (groupMessageId != null ? this.groupMessageId : messageId), command);
    }
    
    public Long getRpcTimeOut() {
        return rpcTimeOut;
    }
    
    public void setRpcTimeOut(Long rpcTimeOut) {
        this.rpcTimeOut = rpcTimeOut;
    }
    
//    public MessageType getMessageType() {
//        return messageType;
//    }
//
//    public void setMessageType(MessageType messageType) {
//        this.messageType = messageType;
//    }
    
    public int getPriority() {
        return priority;
    }
    
    public void setPriority(int priority) {
        this.priority = priority;
    }
    
    public boolean isReply() {
        return isReply;
    }
    
    public void setReply(boolean reply) {
        isReply = reply;
    }
    
    public String getReplyMessageId() {
        return replyMessageId;
    }
    
    public void setReplyMessageId(String replyMessageId) {
        this.replyMessageId = replyMessageId;
    }
}
