/**
 * @Project: 学生
 * @Author: liming
 * @Date: 2018年07月03日
 */
package com.example.educationsystem.controller;

import com.example.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.*;

/**
 * ClassName: Student
 * @Description: 学生
 * @author liming
 * @date 2018年07月03日
 */
@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping(value = "/user/{id}")
    public Object getStudentById(@PathVariable(value = "id") Long id){
        return  studentService.getStudentById(id);
    }
}
