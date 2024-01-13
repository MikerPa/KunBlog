package org.kun.kunblog.base;

/**
 * 自定义返回类接口，该接口中包含错误状态码和错误信息
 */
public interface CustomizeResultCode {
    /*
    获取错误码
    @return 错误状态码
     */
    Integer getCode();
    /*
    获取错误信息
    @return 错误信息
     */
    String getMessage();
}
