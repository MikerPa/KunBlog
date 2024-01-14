package org.kun.kunblog.service.user;

import com.baomidou.mybatisplus.extension.service.IService;
import org.kun.kunblog.dto.UserDto;
import org.kun.kunblog.entity.UserEntity;

public interface UserService extends IService<UserEntity> {
    UserDto getUser(Integer id);
}
