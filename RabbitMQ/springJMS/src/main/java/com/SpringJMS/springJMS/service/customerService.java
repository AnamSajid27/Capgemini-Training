package com.SpringJMS.springJMS.service;


import com.SpringJMS.springJMS.Model.Customer;
import com.SpringJMS.springJMS.RabbitMqConfig;
import com.SpringJMS.springJMS.Repository.CustRepo;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customerService")
public class customerService {

    @Autowired
    AmqpTemplate template;

    @Autowired
    CustRepo custRepo;

    @PostMapping("/add")
    public String addCustomer(@RequestBody Customer customer){

        template.convertAndSend(RabbitMqConfig.EXCHANGE,RabbitMqConfig.ROUTING_KEY, customer);
        return "New Customer Added to the Queue";
    }

    @GetMapping("/showCustomer")
    public List<Customer> getAllCustomer(){

        return  custRepo.findAll();
    }


}
