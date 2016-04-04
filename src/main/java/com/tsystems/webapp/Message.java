package com.tsystems.webapp;


public class Message {


    private Message instance;

    Message getInstance()
    {
        if (instance==null)
            instance=new Message();
        else return instance;
        return instance;
    }
}
