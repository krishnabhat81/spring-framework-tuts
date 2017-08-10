package com.springlearning.AOP.domain;

/**
 * Created by krishna1bhat on 8/10/17.
 */
public class Employee {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String nm) {
        this.name=nm;
    }

    public void throwException(){
        throw new RuntimeException("Dummy Exception");
    }
}
