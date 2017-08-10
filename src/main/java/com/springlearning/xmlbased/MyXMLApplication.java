package com.springlearning.xmlbased;

import com.springlearning.services.MessageService;

/**
 * Created by krishna1bhat on 8/9/17.
 */
public class MyXMLApplication {

    private MessageService service;

    //constructor-based dependency injection
    //	public MyXMLApplication(MessageService svc) {
    //		this.service = svc;
    //	}

    //setter-based dependency injection
    public void setService(MessageService svc){
        this.service = svc;
    }

    public boolean processMessage(String msg, String rec) {
        // some magic like validation, logging etc
        return this.service.sendMessage(msg, rec);
    }
}
