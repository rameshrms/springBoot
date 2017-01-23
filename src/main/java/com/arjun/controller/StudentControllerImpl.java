package com.arjun.controller;

import com.arjun.entity.Student;
import com.arjun.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * Created by Arjun on 1/23/2017.
 */
@RestController
@RequestMapping("/students")
public class StudentControllerImpl {
    @Autowired
    StudentServiceImpl studentService;
    @RequestMapping(method = RequestMethod.GET)
    public Collection<Student> getallStudents(){
        return studentService.getallStudents() ;
    }
}
