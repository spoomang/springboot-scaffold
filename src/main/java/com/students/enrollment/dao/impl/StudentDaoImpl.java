package com.students.enrollment.dao.impl;

import com.students.enrollment.dao.StudentDao;
import com.students.enrollment.dto.Student;
import com.students.enrollment.repository.StudentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StudentDaoImpl implements StudentDao {

    @Autowired
    private StudentsRepository studentsRepository;

    @Override
    public List<Student> findAllStudents() {
        return studentsRepository.findAll();
    }

    @Override
    public Student createStudent(Student student) {
        // TODO validation here.
        // TODO generate id
        // TODO add to student object

        return studentsRepository.createStudent(student);
    }
}
