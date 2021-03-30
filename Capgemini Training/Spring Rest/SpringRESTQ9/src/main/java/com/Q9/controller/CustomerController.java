package com.Q9.controller;



import com.Q9.Service.CustomerService;
import com.Q9.model.customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @RequestMapping(value = "/customer",method = RequestMethod.GET)
    public List<customer> getAllDetails(){
       List<customer> customerList= customerService.getAllCustomer();
       return customerList;
    }

    @RequestMapping(value="/customer/{id}",method=RequestMethod.GET)
    public customer getCustomerById(@PathVariable("id") int id){
        return customerService.getCustomerById(id);
    }

    @RequestMapping(value="/customer",method =RequestMethod.POST)
    public customer addCustomer(@RequestBody customer cust){
        return customerService.addCustomer(cust);

    }

    @RequestMapping(value="/customer/{id}",method = RequestMethod.DELETE)
    public boolean deleteCustomer(@PathVariable("id") int id){
        return customerService.deleteCustomer(id);

    }

    @RequestMapping(value = "/customer",method = RequestMethod.PUT)
    public customer updateEmployee(@RequestBody customer cust){
        return customerService.updateEmployee(cust);
    }
}
