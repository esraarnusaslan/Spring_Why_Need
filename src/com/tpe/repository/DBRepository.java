package com.tpe.repository;

import com.tpe.domain.Message;

public class DBRepository implements Repo{


    @Override
    public void save(Message message) {
        System.out.println("Mesaj DB e kaydediliyor..");
    }
}
