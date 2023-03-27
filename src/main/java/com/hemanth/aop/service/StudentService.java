package com.hemanth.aop.service;

import com.hemanth.aop.model.Student;
import org.springframework.stereotype.Service;

@Service
public class StudentService
{




  public Student postStudents(int usn,String fname,String lname,String branch)
  {
    System.out.println("hello");
    Student s=new Student();
    s.setUsn(usn);
    s.setFirst_name(fname);
    s.setLast_name(lname);
    s.setBranch(branch);
    return s;

  }
}
