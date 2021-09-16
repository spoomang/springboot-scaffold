package com.students.enrollment.controller;

import com.students.enrollment.dao.StudentDao;
import com.students.enrollment.dto.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentsController {

    @Autowired
    private StudentDao studentDao;

    @GetMapping("/students")
    public List<Student> getStudents() {
        return studentDao.findAllStudents();
    }

    @PostMapping("/students")
    public Student createStudent(@RequestBody Student student) {
        return studentDao.createStudent(student);
    }
}
