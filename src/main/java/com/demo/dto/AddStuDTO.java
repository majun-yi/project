package com.demo.dto;

/**
 * @Description 前端入参
 * @Date 2020/10/13 9:53
 */

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel("添加学生入参")
@Data //lombok提供的注解,添加getter和setter及toString()等方法
public class AddStuDTO {
    /**
     * 学生姓名
     */
    @ApiModelProperty("学生姓名")
    private String name;
    /**
     * 学生性别
     */
    @ApiModelProperty("学生性别")
    private String sex;
    /**
     * 年级名称
     */
    @ApiModelProperty("年级名称")
    private String gradeName;
}
