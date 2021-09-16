package com.students.enrollment.dao;

import com.students.enrollment.dto.Student;

import java.util.List;

public interface StudentDao {
    public List<Student> findAllStudents();
    public Student createStudent(Student student);
}
