package com.victor.estaciopoodatabase.resources;

import com.victor.estaciopoodatabase.entities.Student;
import com.victor.estaciopoodatabase.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/students")
public class StudentResource {
    @Autowired
    private StudentRepository studentRepository;

    @GetMapping
    public ResponseEntity<List<Student>> findAll() {
        List<Student> list = studentRepository.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Student> findById(@PathVariable String id) {
        Student student = studentRepository.findById(id).get();
        return ResponseEntity.ok().body(student);
    }
}