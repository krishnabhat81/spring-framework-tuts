package com.springlearning.AOP;

import com.springlearning.AOP.domain.Employee;
import com.springlearning.AOP.service.EmployeeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by krishna1bhat on 8/10/17.
 */
public class MainApp {
    public static void main(String... args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanConfigurationAOP.xml");

        EmployeeService employeeService = context.getBean(EmployeeService.class);

        System.out.println(employeeService.getEmployee().getName());

        employeeService.getEmployee().setName("Krishna");

        Employee emp = context.getBean(Employee.class);
        emp.customAnnotaionCheck();

//        employeeService.getEmployee().throwException();

        context.close();
    }
}
