
package com.ruoyi.system.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 学生
 *
 * @author liurb
 * @date 2025-07-02
 */
@Data
@TableName("student")
public class Student implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * ${column.columnComment}
     */
     @TableId(value = "id", type = IdType.AUTO)
     private Long id;
    /**
     * 姓名
     */
     @TableField("name")
     private String name;
    /**
     * 年龄
     */
     @TableField("age")
     private Long age;
    /**
     * 创建时间
     */
     @TableField("created_at")
     private LocalDateTime createdAt;
}