package com.tpe.app;

import com.tpe.domain.Message;
import com.tpe.repository.FileRepository;
import com.tpe.repository.Repo;
import com.tpe.service.MailService;
import com.tpe.service.MessageService;
import com.tpe.service.SmsService;

public class MyApplication {
    public static void main(String[] args) {

        Message message=new Message();
        message.setMessage("Siparisiniz kargoya verildi");

        //mail ile mesaj gondermelim
//        MailService mailService=new MailService();
//        mailService.sendMessage(message);


        //vazgectik. sms ile gonderelim
//        SmsService smsService=new SmsService();
//        smsService.sendMessage(message);


        //vazgectik whatsapp ile gonderelim. bu cozum degil Interface cozum olur mu ?

//        MessageService service=new SmsService();
        //MessageService service=new MailService();
//        service.sendMessage(message);


//        //run time da hangi servisi kullanacagimiz belirtmek istersek ?
//
//        MessageService service=null;
//        String serviceName=null;
//
//        if(args.length>0){
//            serviceName=args[0];
//        }
//        if(serviceName.equalsIgnoreCase("MailService")){
//            service=new MailService();
//        }else {
//            service=new SmsService();
//        }
//        service.sendMessage(message);


        //mesajlari kalici hale getirmek istersek ?
        //db e kaydet
        Repo repo=new FileRepository();//veya dbrepo olabilirdi. sadece file i db yapabilirsin sadece 1 satirda degisiklik olur
        MessageService service=new MailService(repo);//repo yu enjekte ettik DI denir buna
        service.sendMessage(message);
        service.saveMessage(message);//file a kaydetmek istersek

        MessageService service2=new SmsService(repo);//DI
        service2.saveMessage(message);

        //bagimliligi azaltmak icin
        //1. interface
        //2. DI
        //ancak hala new leme yapiyoruz.




























    }
}
