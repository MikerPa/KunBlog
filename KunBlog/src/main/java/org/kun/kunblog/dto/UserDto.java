package org.kun.kunblog.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

/**
 * @author 84401
 * @version 1.0
 * @description: TODO
 * @date 2024/1/13 19:57
 */
@Data
public class UserDto {
    @ApiModelProperty("主键id")
    private Integer id;

    @ApiModelProperty("用户名")
    private String userName;

    @ApiModelProperty("手机号码")
    private String phoneNum;

    @ApiModelProperty("账号")
    private String account;

    @ApiModelProperty("创建时间")
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss", timezone = "GMT+8")
    private LocalDateTime createTime;

    @ApiModelProperty("更新时间")
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss", timezone = "GMT+8")
    private LocalDateTime updateTime;

    @ApiModelProperty("删除标记：0 未删除；1 已删除")
    private Boolean isDel;
}
