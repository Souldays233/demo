package com.cgd.demo.mapper;

import com.cgd.demo.entity.Student;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentMapper {
    /**
     * 根据id查询用户信息
     * @param id
     * @return
     */
    Student getStudentInfo(int id);
    /**
     * 新增用户
     * @param student
     * @return
     */
    int save (Student student);
    /**
     * 更新用户信息
     * @param student
     * @return
     */
    int update (Student student);

    /**
     * 根据id删除
     * @param id
     * @return
     */
    int deleteById (int id);

    /**
     * 查询所有用户信息
     * @return
     */
    List<Student> selectAll ();

}
