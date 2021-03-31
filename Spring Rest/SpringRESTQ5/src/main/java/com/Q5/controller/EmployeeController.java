package com.Q5.controller;


import com.Q5.Entities.employee;
import com.Q5.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @RequestMapping(value = "/employee",method = RequestMethod.GET)
    public List<employee> getAllDetails(){
       List<employee> employeeList= employeeService.getAllemployees();
       return employeeList;
    }

    @RequestMapping(value="/employee/{id}",method=RequestMethod.GET)
    public employee getEmployeeById(@PathVariable("id") int id){
        return employeeService.getEmployeeById(id);
    }

    @RequestMapping(value="/employee",method =RequestMethod.POST)
    public employee addEmployee(@RequestBody employee emp){
        return employeeService.addEmployee(emp);

    }

    @RequestMapping(value="/employee/{id}",method = RequestMethod.DELETE)
    public boolean deleteEmplolyee(@PathVariable("id") int id){
        return employeeService.deleteEmployee(id);

    }

    @RequestMapping(value = "/employee",method = RequestMethod.PUT)
    public  employee updateEmployee(@RequestBody employee emp){
        return employeeService.updateEmployee(emp);
    }
}
