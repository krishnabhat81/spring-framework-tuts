package com.springlearning.xmlbased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by krishna1bhat on 8/9/17.
 */
public class XMLTestApp {
    public static void main(String... args){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        MyXMLApplication app = context.getBean(MyXMLApplication.class);

        app.processMessage("Hi Krishna", "krishna1bhat@gmail.com");

        //close the context
        ((ConfigurableApplicationContext)context).close();
    }
}
