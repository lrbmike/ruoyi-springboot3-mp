package com.ruoyi.common.core.plus.response;

import com.alibaba.fastjson2.annotation.JSONField;
import lombok.Data;

/**
 * 统一状态返回
 *
 * 主要用于在controller层判断业务层处理的结果返回
 * 一般不进行序列化返回到前端
 *
 * @author liurb
 */
@Data
public class StatusResponse {

    /**
     * 成功标记
     */
    @JSONField(name = "success", serialize = false)
    private Boolean success;
    /**
     * 信息
     */
    @JSONField(name = "msg", serialize = false)
    private String msg;
    /**
     * 状态码
     */
    @JSONField(name = "status_code", serialize = false)
    private Integer statusCode;

}
