package com.Q7.service;

import com.Q7.Repository.OrderRepo;
import com.Q7.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    OrderRepo orderRepo;

    public List<Order> getAllOrders(){
        //System.out.println(orderRepo.findAll());
        return  orderRepo.findAll();
    }

    public Order AddOrder(Order order){


        return orderRepo.insert(order);
    }
    public  Order getOrderById(String id){
        return  orderRepo.findById(id).get();
    }
    public  boolean deteleOrder(String id){
        orderRepo.deleteById(id);
        return true;
    }
    public  Order updateOrder(Order order){
        return  orderRepo.save(order);
    }
}
