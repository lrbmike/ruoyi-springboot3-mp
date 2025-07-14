package com.ruoyi.plus.business;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.ruoyi.common.utils.StringUtils;
import org.springframework.stereotype.Component;
import com.ruoyi.common.core.plus.dto.common.CommonDataPageResponse;
import com.ruoyi.common.core.plus.dto.page.PageDtoRequest;
import com.ruoyi.common.core.plus.dto.page.PageDtoResponse;
import com.ruoyi.common.core.plus.response.StatusResponse;
import org.springframework.beans.BeanUtils;

import jakarta.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

import com.ruoyi.system.domain.vo.StudentVo;
import com.ruoyi.system.domain.Student;
import com.ruoyi.system.service.StudentService;

/**
 * 学生业务
 * 
 * @author liurb
 * @date 2025-07-02
 */
@Component
public class StudentBusiness {

    @Resource
    StudentService settingService;


    /**
     * 分页
     *
     * @param vo
     * @return
     */
    public CommonDataPageResponse<StudentVo> page(StudentVo vo) {
        CommonDataPageResponse<StudentVo> response = new CommonDataPageResponse<>();

        //分页
        Long current = 1L;
        Long size = 10L;

        PageDtoRequest reqPageDto = vo.getPageDto();
        if (reqPageDto != null) {
            current = reqPageDto.getCurrent() != null ? reqPageDto.getCurrent() : 1L;
            size = reqPageDto.getSize() != null ? reqPageDto.getSize() : 10L;
        }

        Page page = new Page<>(current, size);

        LambdaQueryWrapper<Student> queryWrapper = Wrappers.lambdaQuery();

        queryWrapper.like(StringUtils.hasText(vo.getName()), Student::getName, vo.getName());

        queryWrapper.eq(vo.getAge() != null, Student::getAge, vo.getAge());

        if (StringUtils.hasText(vo.getStartDate())) {
            queryWrapper.ge(Student::getCreatedAt, vo.getStartDate());
        }

        if (StringUtils.hasText(vo.getEndDate())) {
            queryWrapper.le(Student::getCreatedAt, vo.getEndDate());
        }

        queryWrapper.orderByDesc(Student::getId);

        IPage<Student> pageRecords = settingService.page(page, queryWrapper);

        //分页记录
        List<Student> records = pageRecords.getRecords();
        //转为vo
        List<StudentVo> voList = new ArrayList<>();
        for (Student record : records) {
            StudentVo settingVo  = new StudentVo();

            BeanUtils.copyProperties(record, settingVo);

            voList.add(settingVo);
        }
        response.setRecords(voList);

        //分页信息
        PageDtoResponse pageDto = new PageDtoResponse();
        pageDto.setCurrent(current);
        pageDto.setSize(size);
        pageDto.setTotal(pageRecords.getTotal());
        pageDto.setPages(pageRecords.getPages());

        response.setPageDto(pageDto);

        return response;
    }

    /**
     * 信息
     *
     * @param vo
     * @return
     */
    public StudentVo info(StudentVo vo) {

        StudentVo settingVo = new StudentVo();

        Long id = vo.getId();

        Student record = settingService.getById(id);

        BeanUtils.copyProperties(record, settingVo);

        return settingVo;
    }

    /**
     * 添加
     *
     * @param vo
     * @return
     */
    public StatusResponse add(StudentVo vo) {
        StatusResponse response = new StatusResponse();

        Student record = new Student();

        BeanUtils.copyProperties(vo, record);

        settingService.save(record);

        response.setSuccess(true);

        return response;
    }

    /**
     * 更新
     *
     * @param vo
     * @return
     */
    public StatusResponse update(StudentVo vo) {
        StatusResponse response = new StatusResponse();

        Student record = new Student();

        BeanUtils.copyProperties(vo, record);

        settingService.updateById(record);

        response.setSuccess(true);

        return response;
    }

    /**
     * 删除
     *
     * @param vo
     * @return
     */
    public StatusResponse delete(StudentVo vo) {
        StatusResponse response = new StatusResponse();

        Long id = vo.getId();

        settingService.removeById(id);

        response.setSuccess(true);

        return response;
    }

}
