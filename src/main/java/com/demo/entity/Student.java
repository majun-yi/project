package com.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

/**
 * @Description 学生实体类
 * @Date 2020/10/11 12:44
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Document("tb_student")
public class Student implements Serializable {
    /**
     * 学生id
     */
    private String id;
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
