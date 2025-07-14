package com.ruoyi.common.core.plus.dto.page;

import lombok.Data;

/**
 * 分页返回
 *
 * @author liurb
 */
 @Data
public class PageDtoResponse {

    private Long current;

    private Long size;

    private Long total;

    private Long pages;
 }
