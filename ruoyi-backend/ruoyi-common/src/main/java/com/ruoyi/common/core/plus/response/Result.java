package com.ruoyi.common.core.plus.response;

import lombok.Data;

/**
 * 返回结果
 *
 * @author liurb
 */
@Data
public class Result<T> {

    private Integer code;
    private String msg;
    private Boolean success;
    private T data;

}