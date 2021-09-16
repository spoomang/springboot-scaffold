package com.students.enrollment.repository;

import com.students.enrollment.dto.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentsRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Student> findAll() {
        return jdbcTemplate.query("select * from students", new BeanPropertyRowMapper<Student>(Student.class));
    }

    public Student createStudent(Student student) {
        int result = jdbcTemplate.update("insert into students(id, firstName, lastName, className, nationality) values(?, ?, ?, ?, ?)",
                student.getId(),
                student.getFirstName(),
                student.getLastName(),
                student.getClassName(),
                student.getNationality()
                );
        return student;
    }
}
