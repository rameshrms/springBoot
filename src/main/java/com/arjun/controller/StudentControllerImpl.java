package com.arjun.controller;

import com.arjun.entity.Student;
import com.arjun.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    
    @RequestMapping(value = "student/{id}",method = RequestMethod.GET )
    public Student getStudentById(@PathVariable("id") int id){
        return studentService.getStudentById(id);
    }
    @RequestMapping(value = "student/delete/{id}" ,method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") int id){
        studentService.removeById(id);
   }
    @RequestMapping(method = RequestMethod.PUT)
    public void updateStudent(@RequestBody Student student){
        studentService.updateStudentById(student);

    }
}
