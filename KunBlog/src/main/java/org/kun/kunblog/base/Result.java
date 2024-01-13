package org.kun.kunblog.base;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author 84401
 * @version 1.0
 * @description: TODO
 * @date 2024/1/13 19:38
 */
@Data
public class Result<T> {
    @ApiModelProperty("是否成功")
    private Boolean success;
    @ApiModelProperty ("返回码")
    private Integer code;
    @ApiModelProperty("返回消息")
    private String msg;
    @ApiModelProperty("返回数据")
    private T data;

    private Result(){

    }

    public static Result ok(){
        Result result=new Result();
        result.setSuccess(true);
        result.setCode(ResultCode.SUCCESS.getCode());
        result.setMsg(ResultCode.SUCCESS.getMessage());
        return result;
    }

    public static Result error(){
        Result result=new Result();
        result.setSuccess(false);
        result.setCode(ResultCode.ERROR.getCode());
        result.setMsg(ResultCode.ERROR.getMessage());
        return result;
    }

    public static <T> Result<T> ok(T data){
        Result result=new Result();
        result.setSuccess(true);
        result.setCode(ResultCode.SUCCESS.getCode());
        result.setMsg(ResultCode.SUCCESS.getMessage());
        result.setData(data);
        return result;
    }

    public Integer getCode() {
        return code;
    }

    public Result setCode(Integer code) {
        this.code = code;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public Result setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public T getData() {
        return data;
    }

    public Result setData(T data) {
        this.data = data;
        return this;
    }
}
