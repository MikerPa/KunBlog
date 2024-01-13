package org.kun.kunblog.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.kun.kunblog.entity.UserEntity;

@Mapper
public interface UserDao extends BaseMapper<UserEntity> {
}
