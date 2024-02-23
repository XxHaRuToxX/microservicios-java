package com.microservice.student.service;

import com.microservice.student.entities.Student;
import com.microservice.student.persistence.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements IStudentService{

    @Autowired
    private IStudentRepository iStudentRepository;

    @Override
    public List<Student> findAll() {
        return (List<Student>) iStudentRepository.findAll();
    }

    @Override
    public Student findById(Long id) {
        return iStudentRepository.findById(id).orElseThrow();
    }

    @Override
    public void save(Student student) {
        iStudentRepository.save(student);
    }

    @Override
    public List<Student> findByIdCourse(Long idCourse) {
        return iStudentRepository.findAllStudent(idCourse);
    }
}
