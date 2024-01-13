package org.kun.kunblog.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.kun.kunblog.base.Result;
import org.kun.kunblog.dto.UserDto;
import org.kun.kunblog.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 84401
 * @version 1.0
 * @description: TODO
 * @date 2024/1/13 19:29
 */
@RestController
@RequestMapping("/api/user")
@Api("用户管理")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    @ApiOperation("获取用户")
    public Result<UserDto> getUser(@RequestParam("id") String id){
        return Result.ok(userService.getUser(id));
    }
}
