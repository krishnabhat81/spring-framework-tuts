package com.springlearning.DI.annotationbased;

import com.springlearning.DI.services.EmailService;
import com.springlearning.DI.services.MessageService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by krishna1bhat on 8/9/17.
 */
@Configuration
@ComponentScan(value = {"com.springlearning"})
public class JavaAnnotationConfiguration {
    @Bean
    public MessageService getMessageService(){
        return new EmailService();
    }
}

//we can use xml configuration for annotation configuration
//like:
/*

    --------

    <!-- enables annotations - otherwise spring ignores all annotations -->
    <context:annotation-config />

    <bean init-method="init" destroy-method="cleanup" lazy-init="true" scope="singleton" id = "helloWorld" class = "com.annotationexample.HelloWorld"/>
    <bean id = "myMessage" class = "com.annotation.MyMessage"/>

    ----------

 */