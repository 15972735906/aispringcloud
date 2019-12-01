package com.southwind.controller;

import com.southwind.entity.Student;
import com.southwind.repository.StudentRespotory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/student")
public class StudentHandler {

    @Autowired
    StudentRespotory studentRespotory;

    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return studentRespotory.findAll();
    }

    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable("id") long id){
        return studentRespotory.findById(id);
    }

    @PostMapping("/save")
    public void save(@RequestBody Student student){
        studentRespotory.saveOrUpdate(student);
    }

    @PutMapping("/update")
    public void update(@RequestBody Student student){
        studentRespotory.saveOrUpdate(student);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") long id){
        studentRespotory.deleteById(id);
    }
}
