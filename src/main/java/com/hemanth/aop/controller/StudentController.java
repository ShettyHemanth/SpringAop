package com.hemanth.aop.controller;

import com.hemanth.aop.model.Student;
import com.hemanth.aop.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController
{

    @Autowired

    StudentService ss;


    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public Student addStudent(@RequestParam("usn")int usn,@RequestParam("first_name") String first_name,@RequestParam("last_name") String last_name,@RequestParam("branch") String branch)
    {
       return ss.postStudents(usn,first_name,last_name,branch);

    }

//    @RequestMapping(method = RequestMethod.GET,value = "/details")
//    public void getStudent(Student student)
//    {
//        ss.getStudents(student);
//
//    }


}
