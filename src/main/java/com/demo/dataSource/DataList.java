package com.demo.dataSource;

import com.demo.entity.Student;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description 充当数据库数据的集合
 * @Date 2020/10/11 12:43
 */
@Data
public class DataList {
    /**
     * 充当数据源的容器
     */
    private static List<Student> stuList = new ArrayList<>();

    static {
        stuList.add(new Student(1, "张三", "男", "一年级"));
        stuList.add(new Student(2, "李四", "男", "一年级"));
        stuList.add(new Student(3, "王五", "男", "一年级"));
        stuList.add(new Student(4, "赵柳", "女", "一年级"));
        stuList.add(new Student(5, "王利", "男", "一年级"));
        stuList.add(new Student(6, "李雪", "女", "一年级"));
        stuList.add(new Student(7, "马上", "男", "一年级"));
        stuList.add(new Student(8, "刘志", "男", "一年级"));
        stuList.add(new Student(9, "杨柳", "男", "一年级"));
        stuList.add(new Student(10, "郭旭", "男", "一年级"));

        stuList.add(new Student(1, "萧炎", "男", "二年级"));
        stuList.add(new Student(2, "林东", "男", "二年级"));
        stuList.add(new Student(3, "凌天", "男", "二年级"));
        stuList.add(new Student(4, "李七夜", "女", "二年级"));
        stuList.add(new Student(5, "剑圣", "男", "二年级"));
        stuList.add(new Student(6, "盖聂", "女", "二年级"));
        stuList.add(new Student(7, "卫庄", "男", "二年级"));
        stuList.add(new Student(8, "胜七", "男", "二年级"));
        stuList.add(new Student(9, "雪女", "男", "二年级"));
        stuList.add(new Student(10, "旷秀", "男", "二年级"));
    }

    public static List<Student> newInstance() {
        return stuList;
    }


}
