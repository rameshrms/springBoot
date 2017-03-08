package com.arjun.DAO;

import com.arjun.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Arjun on 1/23/2017.
<<<<<<< HEAD
 * gkjhkjh
=======
 * gjhgkjjk
>>>>>>> refs/heads/master
 */
@Repository
public class StudentDAOImpl {

    private static Map<Integer ,Student> students;
    static {
        students = new HashMap<Integer,Student>(){
            {
            put(1,new Student(1,"arjun","hadoop"));
                put(2,new Student(2,"ram","abap"));
                put(3,new Student(3,"ajay","java"));
            }
        };
    };

    public Collection<Student> getallStudents(){
 return this.students.values();
    }
    public Student getStudentById(int id){
        return students.get(id);
    }

    public void removeByd(int id) {
        students.remove(id);
    }

    public void updateStudentById(Student student) {
      Student updateStudent  =students.get(student.getId());
      updateStudent.setName(student.getName());
        updateStudent.setCourse(student.getCourse());
    }
}
