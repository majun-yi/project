package com.demo.service.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.util.NumberUtil;
import com.demo.dto.AddStuDTO;
import com.demo.dto.QueryParamDTO;
import com.demo.dto.UpdateStuDTO;
import com.demo.entity.Student;
import com.demo.repository.StudentRepository;
import com.demo.service.IStudentService;
import com.demo.vo.PageVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Optional;

/**
 * @Description 业务实现类
 * @Date 2020/10/11 13:45
 */
@Service
public class StudentServiceImpl implements IStudentService {
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public String save(AddStuDTO dto) {
        Student student = new Student();
        BeanUtil.copyProperties(dto, student);
        Student result = studentRepository.save(student);
        return result.getId();
    }

    @Override
    public PageVO stuPageList(QueryParamDTO queryParam,Integer page,Integer size) {
        Query query = new Query();
        long count = mongoTemplate.count(query, Student.class);
        List<Student> students = mongoTemplate.find(query, Student.class);
        PageVO pageVO = new PageVO(students, count);
        return pageVO;
    }

    @Override
    public Student getStudent(String id) {
        Optional<Student> studentOptional = studentRepository.findById(id);
        if (studentOptional.isPresent())//有值则返回实体值,否则返回空
            return studentOptional.get();
        return null;
    }

    @Override
    public String UpdateStudent(UpdateStuDTO dto) {
        Optional<Student> optional = studentRepository.findById(dto.getId());
        if (optional.isPresent()) {
            Student student = optional.get();
            if (!StringUtils.isEmpty(dto.getName()))
                student.setName(dto.getName());
            if (!StringUtils.isEmpty(dto.getSex()))
                student.setSex(dto.getSex());
            if (!StringUtils.isEmpty(dto.getGradeName()))
                student.setGradeName(dto.getGradeName());
            Student result = studentRepository.save(student);
            return result.getId();
        }
        return null;
    }

    @Override
    public String deleteStudent(String id) {
        studentRepository.deleteById(id);
        return id;
    }
}
