package com.example.eurekacommon.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.eurekacommon.pojo.PersonInfo;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author chenhao
 * @since 2021-06-13
 */
@Mapper
public interface PersonInfoMapper extends BaseMapper<PersonInfo> {

}
