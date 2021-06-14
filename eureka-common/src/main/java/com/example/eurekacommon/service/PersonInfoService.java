package com.example.eurekacommon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.eurekacommon.pojo.PersonInfo;
import org.springframework.stereotype.Component;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author HQ
 * @since 2021-06-13
 */
@Component
public interface PersonInfoService extends IService<PersonInfo> {
    PersonInfo getById(int id);
}
