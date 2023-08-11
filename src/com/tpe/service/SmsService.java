package com.tpe.service;

import com.tpe.domain.Message;
import com.tpe.repository.DBRepository;
import com.tpe.repository.Repo;

public class SmsService implements MessageService{

    private Repo repo;

    public SmsService(Repo repo) {
        this.repo = repo;
    }

    public void sendMessage(Message message){
        System.out.println("Ben bir sms servisiyim: "+message.getMessage());
    }

    @Override
    public void saveMessage(Message message) {
        //Repo repo=new DBRepository();
        repo.save(message);
    }


}
