package com.hemanth.aop.studentAspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class StudentAspect
{

    @Before(value="execution(* com.hemanth.aop.service.StudentService.*(..)) and args(usn,fname,lname,branch)")
    public void beforeAdvice(JoinPoint joinPoint,int usn, String fname, String lname,String branch)
    {
        System.out.println("Before method:" + joinPoint.getSignature());
        System.out.println("Creating Employee with first name - " + fname + ", second name - " + lname + " and id - " );

    }


    @After(value="execution(* com.hemanth.aop.service.StudentService.*(..)) and args(usn,fname,lname,branch)")
    public void afterAdvice(JoinPoint joinPoint,int usn, String fname, String lname,String branch)
    {
        System.out.println("After method:" + joinPoint.getSignature());
        System.out.println("Creating Employee with first name - " + fname + ", second name - " + lname + " and id - " );

    }

}
