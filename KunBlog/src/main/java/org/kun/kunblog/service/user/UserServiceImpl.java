package org.kun.kunblog.service.user;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.kun.kunblog.dao.UserDao;
import org.kun.kunblog.dto.UserDto;
import org.kun.kunblog.entity.UserEntity;
import org.springframework.stereotype.Service;

/**
 * @author 84401
 * @version 1.0
 * @description: TODO
 * @date 2024/1/13 19:27
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserDao, UserEntity> implements UserService {
    @Override
    public UserDto getUser(String id) {
        UserEntity userEntity = baseMapper.selectOne(new LambdaQueryWrapper<UserEntity>().eq(UserEntity::getId, id));
        UserDto user = BeanUtil.toBean(userEntity, UserDto.class);
        return user;
    }
}
