package com.ruoyi.common.core.plus.response;

/**
 * 返回结果工具类
 *
 * @author liurb
 */
public class ResultUtil {

    /**
     * 成功返回
     *
     * @param object
     * @return
     */
    public static Result success(Object object){
        Result result = new Result();
        result.setSuccess(true);
        result.setCode(ResultEnum.SUCCESS.getCode());
        result.setMsg(ResultEnum.SUCCESS.getMsg());
        result.setData(object);
        return result;
    }

    /**
     * 成功但不带数据
     *
     * @return
     */
    public static Result success(){
        return success(null);
    }

    /**
     * 默认失败返回
     *
     * @param msg
     * @return
     */
    public static Result fail(String msg) {
        Result result = new Result();
        result.setSuccess(false);
        result.setCode(ResultEnum.DEFAULT_FAIL.getCode());
        result.setMsg(msg);
        return result;
    }

    /**
     * 失败返回
     *
     * @param code
     * @param msg
     * @return
     */
    public static Result fail(Integer code, String msg){
        Result result = new Result();
        result.setSuccess(false);
        if (null == code) {
            code = ResultEnum.DEFAULT_FAIL.getCode();
        }
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }


}
