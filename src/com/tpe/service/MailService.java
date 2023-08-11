package com.tpe.service;

import com.tpe.domain.Message;
import com.tpe.repository.DBRepository;
import com.tpe.repository.FileRepository;
import com.tpe.repository.Repo;

public class MailService implements MessageService{


    private Repo repo;//new DBRepository();

    public MailService(Repo repo) {
        this.repo = repo;
    }

    public void sendMessage(Message message){

        System.out.println("Ben bir mail servisiyim. Mesajiniz: " +message.getMessage());



    }

    @Override
    public void saveMessage(Message message) {
        //save methodunu kullanmak icin objeye ihtiyacimiz var

       // Repo repo=new DBRepository();
        //Repo repo=new FileRepository();//file a kaydetmek istedigimde bunu yaptim
        repo.save(message);

    }


}
