package com.SpringJMS.springJMS.service;


import com.SpringJMS.springJMS.Model.Customer;
import com.SpringJMS.springJMS.RabbitMqConfig;
import com.SpringJMS.springJMS.Repository.CustRepo;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class customerNotification {

    @Autowired
    CustRepo custRepo;

    @RabbitListener(queues = RabbitMqConfig.QUEUE)
    public  void consumeMessage(Customer customer){
        custRepo.save(customer);
        System.out.println("Data added to the database Successfully");
    }
}
