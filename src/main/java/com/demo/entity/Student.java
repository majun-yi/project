package com.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description 学生实体类
 * @Date 2020/10/11 12:44
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    /**
     * 学生id
     */
    private Integer id;
    /**
     * 学生姓名
     */
    private String name;
    /**
     * 学生性别
     */
    private String sex;
    /**
     * 年级名称
     */
    private String gradeName;
}
