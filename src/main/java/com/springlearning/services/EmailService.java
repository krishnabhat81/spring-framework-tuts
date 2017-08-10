package com.springlearning.services;

import org.springframework.stereotype.Component;

/**
 * Created by krishna1bhat on 8/9/17.
 */
public class EmailService implements MessageService {
    public boolean sendMessage(String msg, String rec) {
        System.out.println("Email Sent to "+rec+ " with Message = "+msg);
        return true;
    }
}
