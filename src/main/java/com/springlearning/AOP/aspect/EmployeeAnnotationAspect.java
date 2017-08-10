package com.springlearning.AOP.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * Created by krishna1bhat on 8/10/17.
 */
@Aspect
public class EmployeeAnnotationAspect {
    @Before("@annotation(com.springlearning.AOP.customannotaion.Loggable)")
    public void myAdvice(){
        System.out.println("Executing myAdvice using annotation @Loggable!!");
    }
}
