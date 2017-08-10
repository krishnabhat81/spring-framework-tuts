package com.springlearning.services;

/**
 * Created by krishna1bhat on 8/9/17.
 */
public class TwitterService implements MessageService {
    public boolean sendMessage(String msg, String rec) {
        System.out.println("Twitter message Sent to "+rec+ " with Message = "+msg);
        return true;
    }
}
