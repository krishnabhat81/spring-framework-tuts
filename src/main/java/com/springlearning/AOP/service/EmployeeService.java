package com.springlearning.AOP.service;

import com.springlearning.AOP.domain.Employee;

/**
 * Created by krishna1bhat on 8/10/17.
 */
public class EmployeeService {
    private Employee employee;

    public Employee getEmployee(){
        return this.employee;
    }

    public void setEmployee(Employee e){
        this.employee=e;
    }
}
