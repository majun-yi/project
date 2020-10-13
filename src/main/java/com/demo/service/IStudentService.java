package com.demo.service;

import com.demo.dto.AddStuDTO;
import com.demo.dto.QueryParamDTO;
import com.demo.dto.UpdateStuDTO;
import com.demo.entity.Student;
import com.demo.vo.PageVO;

/**
 * @Description 不同的业务场景
 * @Date 2020/10/11 13:40
 */
public interface IStudentService {
    /**
     * 添加学生
     */
    String save(AddStuDTO dto);

    /**
     * 分页查询
     */
    PageVO stuPageList(QueryParamDTO queryParam, Integer page, Integer size);

    /**
     * 根据id查询学生
     */
    Student getStudent(String id);

    /**
     * 修改学生
     */
    String UpdateStudent(UpdateStuDTO dto);

    /**
     * 删除学生(真删除)
     */
    String deleteStudent(String id);
}
