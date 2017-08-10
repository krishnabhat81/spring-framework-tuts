package com.springlearning.DI.annotationbased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by krishna1bhat on 8/9/17.
 */
public class AnnotationTestApp {
    public static void main(String... args){
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaAnnotationConfiguration.class);
        MyAnnotationApplication app = context.getBean(MyAnnotationApplication.class);

        app.processMessage("Hi Krishna ", "krishna1bhat@gmail.com");

        //close the context
        ((ConfigurableApplicationContext)context).close();
    }
}
