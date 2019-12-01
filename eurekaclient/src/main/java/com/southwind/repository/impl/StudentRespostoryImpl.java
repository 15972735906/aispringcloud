package com.southwind.repository.impl;

import com.southwind.entity.Student;
import com.southwind.repository.StudentRespotory;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
@Repository
public class StudentRespostoryImpl implements StudentRespotory {

    public static Map<Long,Student> studentMap;

    static{
        studentMap = new HashMap<>();
        studentMap.put(1L,new Student(1L,"张三",17));
        studentMap.put(2L,new Student(2L,"李四",18));
        studentMap.put(3L,new Student(3l,"王五",19));
    }
    @Override
    public Collection<Student> findAll() {
        return studentMap.values();
    }

    @Override
    public Student findById(long id) {
        return studentMap.get(id);
    }

    @Override
    public void saveOrUpdate(Student student) {
        studentMap.put(student.getId(),student);
    }

    @Override
    public void deleteById(long id) {
        studentMap.remove(id);
    }
}
