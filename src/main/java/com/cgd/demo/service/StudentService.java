package com.cgd.demo.service;

import com.cgd.demo.entity.Student;
import com.cgd.demo.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentMapper studentMapper;

    public Student getStudentInfo(int id) {
        return studentMapper.getStudentInfo(id);
    }


    public int deleteById(int id) {
        return studentMapper.deleteById(id);
    }

    public int update(Student student) {
        return studentMapper.update(student);
    }

    public Student save(Student student) {
        int save = studentMapper.save(student);
        return student;
    }

    public List<Student> selectAll() {
        return studentMapper.selectAll();
    }
}
