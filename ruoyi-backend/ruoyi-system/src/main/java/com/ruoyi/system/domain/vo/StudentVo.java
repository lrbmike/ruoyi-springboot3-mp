
package com.ruoyi.system.domain.vo;

import lombok.Data;
import com.ruoyi.common.core.plus.dto.BasePageDtoRequest;
import java.time.LocalDateTime;

/**
 * 学生对象 student vo
 *
 * @author liurb
 * @date 2025-07-02
 */
@Data
public class StudentVo extends BasePageDtoRequest {

    /**
     * ${column.columnComment}
     */
    private Long id;
    /**
     * 姓名
     */
    private String name;
    /**
     * 年龄
     */
    private Long age;
    /**
     * 创建时间
     */
    private LocalDateTime createdAt;

}