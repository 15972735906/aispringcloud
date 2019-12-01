package com.southwind.repository;

import com.southwind.entity.Student;

import java.util.Collection;

public interface StudentRespotory {
    public Collection<Student> findAll();
    public Student findById(long id);
    public void saveOrUpdate(Student student);
    public void deleteById(long id);
}
