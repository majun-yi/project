package com.demo.controller;

import cn.hutool.core.date.DateUtil;
import com.demo.event.StudentEvent;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description 学生相关服务
 * @Date 2020/10/11 16:45
 */
@Api(tags = "学生相关")
@RestController
@Slf4j
public class StudentController {
    @Autowired
    private ApplicationContext applicationContext;

    @GetMapping("/hello")
    @ApiOperation("事件")
    public String hello() {
        log.error("事件开始发布()时间{}", DateUtil.now());
        applicationContext.publishEvent(new StudentEvent(this, "hello:"));
        return "success";
    }
}
