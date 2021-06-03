package com.cgd.demo.controller;

import com.cgd.demo.entity.Student;
import com.cgd.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@ResponseBody
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;
    //通过用户id获取用户所有信息
    //    http://souldays.top:8081/student/getStudent/1(此处1为要获取的id）
    @RequestMapping(value = "getStudent/{id}", method = RequestMethod.GET)
    public Student GetStudent(@PathVariable int id) {
        return studentService.getStudentInfo(id);
    }

    //通过用户id删除用户
    //    http://souldays.top:8081/student/delete?id=1(此处1为要删除的id）
    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public String delete(int id) {
        int result = studentService.deleteById(id);
        if (result >= 1) {
            return "删除成功";
        } else {
            return "删除失败";
        }
    }
    //根据用户id更新用户信息
    //http://souldays.top:8081/student/update?id=2&name=波波&dept=CS&age=1&phone=10000
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String update(Student student) {
        int result = studentService.update(student);
        if (result >= 1) {
            return "修改成功";
        } else {
            return "修改失败";
        }
    }
    //插入新用户
    //    http://souldays.top:8081/student/insert?id=3&name=波球&dept=CS&age=20&phone=10086
    @RequestMapping(value = "/insert", method = RequestMethod.GET)
    public Student insert(Student student) {
        return studentService.save(student);
    }
    //打印所有用户信息
    //    http://souldays.top:8081/student/selectAll
    @RequestMapping("/selectAll")
    @ResponseBody
    public List<Student> ListStudent() {
        return studentService.selectAll();
    }
}
