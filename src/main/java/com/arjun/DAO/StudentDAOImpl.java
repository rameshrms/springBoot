package com.arjun.DAO;

import com.arjun.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Arjun on 1/23/2017.
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
}
