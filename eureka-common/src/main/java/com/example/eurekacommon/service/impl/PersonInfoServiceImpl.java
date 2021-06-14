package com.example.eurekacommon.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.eurekacommon.mapper.PersonInfoMapper;
import com.example.eurekacommon.pojo.PersonInfo;
import com.example.eurekacommon.service.PersonInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author HQ
 * @since 2021-06-13
 */
@Service
public class PersonInfoServiceImpl extends ServiceImpl<PersonInfoMapper, PersonInfo> implements PersonInfoService {
    @Autowired
    PersonInfoMapper personInfoMapper;

    @Override
    @Cacheable(key = "'personInfo:'+#id")
    public PersonInfo getById(int id){
        return personInfoMapper.selectById(id);
    }
}
