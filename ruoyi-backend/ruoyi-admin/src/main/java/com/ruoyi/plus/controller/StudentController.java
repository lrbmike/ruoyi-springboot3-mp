package com.ruoyi.plus.controller;

import com.ruoyi.common.core.plus.dto.common.CommonDataPageResponse;
import com.ruoyi.common.core.plus.response.Result;
import com.ruoyi.common.core.plus.response.ResultUtil;
import com.ruoyi.common.core.plus.response.StatusResponse;
import com.ruoyi.plus.business.StudentBusiness;
import com.ruoyi.system.domain.vo.StudentVo;
import jakarta.annotation.Resource;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * 学生控制器
 * 
 * @author liurb
 * @date 2025-07-02
 */
@RestController
@RequestMapping("/system/student")
public class StudentController {

    @Resource
    StudentBusiness business;

    /**
     * 分页查询学生列表
     */
    @PreAuthorize("@ss.hasPermi('system:student:list')")
    @PostMapping("/page")
    public Result page(@RequestBody StudentVo vo) {
        CommonDataPageResponse<StudentVo> response = business.page(vo);

        return ResultUtil.success(response);
    }

    /**
     * 获取学生详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:student:query')")
    @PostMapping("/info")
    public Result info(@RequestBody StudentVo vo) {

        StudentVo info = business.info(vo);

        return ResultUtil.success(info);
    }

    /**
     * 新增学生
     */
    @PreAuthorize("@ss.hasPermi('system:student:add')")
    @PostMapping("/add")
    public Result add(@RequestBody StudentVo vo) {

        StatusResponse response = business.add(vo);
        if (response.getSuccess() == false) {
            return ResultUtil.fail(response.getMsg());
        }

        return ResultUtil.success(response);
    }

    /**
     * 修改学生
     */
    @PreAuthorize("@ss.hasPermi('system:student:edit')")
    @PostMapping("/update")
    public Result update(@RequestBody StudentVo vo) {

        StatusResponse response = business.update(vo);
        if (response.getSuccess() == false) {
            return ResultUtil.fail(response.getMsg());
        }

        return ResultUtil.success(response);
    }

    /**
     * 删除学生
     */
    @PreAuthorize("@ss.hasPermi('system:student:remove')")
    @PostMapping("/delete")
    public Result delete(@RequestBody StudentVo vo) {

        StatusResponse response = business.delete(vo);
        if (response.getSuccess() == false) {
            return ResultUtil.fail(response.getMsg());
        }

        return ResultUtil.success(response);
    }

}
