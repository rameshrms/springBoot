package com.arjun.service;

import com.arjun.DAO.StudentDAOImpl;
import com.arjun.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by Arjun on 1/23/2017.
 */
@Service
public class StudentServiceImpl {
  @Autowired
   private StudentDAOImpl studentDAO;

    public Collection<Student> getallStudents(){
      return  studentDAO.getallStudents();
    }

    public Student getStudentById(int id){
        return studentDAO.getStudentById(id);
    }

    public void removeById(int id) {
        studentDAO.removeByd(id);
    }


    public void updateStudentById(Student student) {
        studentDAO.updateStudentById( student);
    }
}
