package com.Q7.controller;

import com.Q7.model.Order;
import com.Q7.service.OrderService;
import javafx.application.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.aggregation.BooleanOperators;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaTypeEditor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.core.MediaType;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;


    @RequestMapping(value = "/orders",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON)
    public List<Order> getAllOrder(){
        List<Order> list = new ArrayList<>();
        list = orderService.getAllOrders();
        System.out.println(list);
       return  list;
    }

    @RequestMapping(value = "/orders",method = RequestMethod.POST)
    public Order addOrder(@RequestBody Order order){
        //System.out.println(order.getItem()+" "+order.getAmountPaid());

        return  orderService.AddOrder(order);
    }

    @RequestMapping(value = "/orders/{id}",method = RequestMethod.GET)
    public  Order getOrderById(@PathVariable("id") String id){
        return  orderService.getOrderById(id);
    }

    @RequestMapping(value="/orders/{id}",method = RequestMethod.DELETE)
    public boolean deleteOrder(@PathVariable("id") String id){
        return  orderService.deteleOrder(id);
    }

    @RequestMapping(value="/orders",method = RequestMethod.PUT)
    public Order updateOrder(@RequestBody Order order){
        return  orderService.updateOrder(order);
    }


}
