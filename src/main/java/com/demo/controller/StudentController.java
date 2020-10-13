package com.demo.controller;

import cn.hutool.core.date.DateUtil;
import com.demo.dto.AddStuDTO;
import com.demo.dto.QueryParamDTO;
import com.demo.dto.UpdateStuDTO;
import com.demo.entity.Student;
import com.demo.event.StudentEvent;
import com.demo.service.IStudentService;
import com.demo.vo.PageVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * @Description 学生相关服务
 * @Date 2020/10/11 16:45
 */
@Api(tags = "学生相关")
@RestController
@Slf4j
@RequestMapping("/student")
public class StudentController {
    /**
     * 构造的方式注入 --> 等同 @Autowire
     */
    private final ApplicationContext applicationContext;
    private final IStudentService service;

    public StudentController(ApplicationContext applicationContext, IStudentService service) {
        this.applicationContext = applicationContext;
        this.service = service;
    }

    @GetMapping("/hello")
    @ApiOperation("事件")
    public String hello() {
        log.error("事件开始发布()时间{}", DateUtil.now());
        applicationContext.publishEvent(new StudentEvent(this, "hello:"));
        return "success";
    }

    @ApiOperation("添加学生信息")
    @PostMapping("/add")
    public String save(@RequestBody AddStuDTO dto) {
        return service.save(dto);
    }

    @ApiOperation("查询单个")
    @GetMapping("/getStudent")
    public Student get(String id) {
        return service.getStudent(id);
    }

    @ApiOperation("分页查询")
    @PostMapping("/pageList/{page}/{size}")
    public PageVO getPage(@RequestBody QueryParamDTO param, @PathVariable Integer page, @PathVariable Integer size) {
        return service.stuPageList(param, page, size);
    }

    @ApiOperation("修改")
    @PutMapping("/update")
    public String update(@RequestBody @Validated UpdateStuDTO dto) {
        return service.UpdateStudent(dto);
    }

    @ApiOperation("删除")
    @DeleteMapping("/delete")
    public String delete(String id) {
        return service.deleteStudent(id);
    }
}
