package com.example.ranbbitproducer.message;

/**  
 * @Author by fyin.
 * @date 2018/06/13.  
 * @description 
 */  
public enum MessengerStatus {
    /**
     * 还未初始化
     */
    NOT_INIT(0),
    /**
     * 已初始化
     */
    INITED(1),
    /**
     * 启动中
     */
    STARTING(2),
    /**
     * 已启动
     */
    STARTED(3),
    /**
     * 停止中
     */
    STOPPING(-1),
    /**
     * 已停止
     */
    STOPPED(-2);

    private int value;
    MessengerStatus(int value){
        this.value=value;
    }
    public int getValue(){
        return this.value;
    }
}
