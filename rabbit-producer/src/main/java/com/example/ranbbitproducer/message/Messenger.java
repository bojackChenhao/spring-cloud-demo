package com.example.ranbbitproducer.message;

/**
 * @Author by fyin.
 * @date 2018/06/06.
 * @description
 */
public enum Messenger {
    /**
     * 单例
     */
    INST;
    
//    private static final Log log = LogFactory.get();
//    public Messenger init(MessengerSetting setting) {
//        this.msgIdempotent = setting.isMsgIdempotent();
//        log.info("使用消息幂等功能：{}", this.msgIdempotent ? "是" : "否");
//        this.connectNode = setting.getMessengerNode();
//        this.centerNode = setting.getCenterNode();
//        this.baseDir = setting.getBaseDir();
//        this.retryCount = setting.getRetryCount();
//        this.dbUserName = setting.getDbUserName() == null ? "" : setting.getDbUserName();
//        this.dbPassword = setting.getDbPassword() == null ? "" : setting.getDbPassword();
//        this.fileMaxSaveDays = setting.getFileMaxSaveDays();
//
//        if (null == setting.getMsProvider()) {
//            setting.setMsProvider(MessengerSetting.DEFAULT_MQ_ENTITY);
//        }
//
//        this.ms = MessageServiceFactory.newService(setting.getMsProvider());
//
//        for (Map.Entry<String, CmdMessageHandlerDef> entry : setting.getAllMessageHandler()
//                .entrySet()) {
//            if (CMDMap.containsKey(entry.getKey())) {
//                log.warn("{}指令已经存在", entry.getKey());
//            } else {
//                CMDMap.put(entry.getKey(), entry.getValue());
//            }
//        }
//
//        //注册使用Messenger的组件里面会使用到的指令
//        for (IMessengerComponent component : setting.getComponentList()) {
//            List<CmdMessageHandlerDef> defList = component.getCmdHandler();
//            if (CollUtil.isNotEmpty(defList)) {
//                for (CmdMessageHandlerDef def : defList) {
//                    if (CMDMap.containsKey(def.getCommand())) {
//                        log.warn("{}指令已经存在", def.getCommand());
//                    } else {
//                        log.debug("{}注册指令[{}]-[{}]-[{}]", component.getClass()
//                                .getSimpleName(), def.getMessageType()
//                                .name(), def.getCommand(), def.getMessageHandler());
//                        CMDMap.put(def.getCommand(), def);
//                    }
//                }
//            }
//        }
//        //初始化文件夹
//        log.info("初始化存储目录：{}", this.baseDir);
//        DirHelper.INST.init(this.baseDir);
//        this.status = MessengerStatus.INITED;
//        return this;
//    }


}
