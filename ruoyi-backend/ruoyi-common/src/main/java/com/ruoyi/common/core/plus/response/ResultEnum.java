package com.ruoyi.common.core.plus.response;

/**
 * 统一返回信息枚举
 *
 * @author liurb
 */
public enum ResultEnum {

    /**
     * 默认失败
     */
    DEFAULT_FAIL(-99, "失败"),
    /**
     * 接口调用错误返回
     *
     */
    API_ERROR(-2,"接口调用错误"),
    /**
     * 系统错误返回
     *
     */
    SYS_ERROR(-1,"系统错误"),
    /**
     * 成功返回
     */
    SUCCESS(0,"成功"),
    /**
     * 授权失败返回
     */
    AUTH_ERROR(401,"授权失败"),
    /**
     * 参数验证失败返回
     */
    PARAMS_ERROR(1002,"参数验证失败"),
    /**
     * 黑名单失败返回
     */
    BLACKLIST_ERROR(1003,"黑名单验证失败"),
    /**
     * 用户未注册
     */
    REGISTER_ERROR(1004,"用户还未注册"),
    /**
     * 重复提交
     */
    REPEAT_REQUEST_ERROR(1009,"重复请求")
    ;
    private Integer code;
    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;

    }

}
