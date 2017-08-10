package com.springlearning.AOP.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by krishna1bhat on 8/10/17.
 */

@Aspect
public class EmployeeAspect {
    @Before("execution(public String getName())")//string parameter passed in the @Before annotation is the Pointcut expression
    public void getNameAdvice(){//will execute for any Spring Bean method with signature public String getName()
        System.out.println("Executing Advice on getName()");
    }

    @Before("execution(* com.springlearning.AOP.service.*.get*())")
    public void getAllAdvice(){
        System.out.println("Service method getter called");
    }

    //Sometimes we have to use same Pointcut expression at multiple places, we can create an empty method with @Pointcut annotation and then use it as expression in advices.
    @Pointcut("execution(public String getName())")
    public void getNamePointcut(){}

    @Before("getNamePointcut()")
    public void loggingAdvice(){
        System.out.println("Executing loggingAdvice on getName()");
    }

    @Before("getNamePointcut()")
    public void secondAdvice(){
        System.out.println("Executing secondAdvice on getName()");
    }
}
