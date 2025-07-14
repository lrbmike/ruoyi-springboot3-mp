package com.ruoyi.common.core.plus.dto;

import com.alibaba.fastjson2.annotation.JSONField;
import com.ruoyi.common.core.plus.dto.page.PageDtoRequest;
import lombok.Data;

/**
 * 分页请求数据
 *
 * @author liurb
 */
@Data
public class BasePageDtoRequest {

    /**
     * 查询开始时间
     * 格式：yyyy-MM-dd
     */
    private String startDate;

    /**
     * 查询结束时间
     * 格式：yyyy-MM-dd
     */
    private String endDate;

    /**
     * 分页
     */
    private PageDtoRequest pageDto;
}
