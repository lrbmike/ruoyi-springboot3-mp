package com.ruoyi.common.core.plus.dto.common;

import com.ruoyi.common.core.plus.dto.BasePageDtoResponse;
import lombok.Data;

import java.util.List;

 /**
 * 分页公共返回
 *
 * @author liurb
 */
 @Data
public class CommonDataPageResponse<T> extends BasePageDtoResponse {

    List<T> records;

}
