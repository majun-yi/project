package com.demo.repository;

import com.demo.entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * 学生相关仓储,可使用mongo相关的方法或者自定义方法
 */
public interface StudentRepository extends MongoRepository<Student, String> {
    /**
     * 自定义方法,举例(暂未用到)
     */
}
