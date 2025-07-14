package com.ruoyi.common.core.plus.dto.page;

import lombok.Data;

/**
 * 分页请求数据
 *
 * @author liurb
 */
@Data
public class PageDtoRequest {

    private Long current;

    private Long size;
}
