package com.Q5.Service;

import com.Q5.Entities.employee;

import com.Q5.Repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class EmployeeService {

    @Autowired
    EmployeeRepo customerRepo;

    public List<employee> getAllemployees(){
        final List<employee> employeeList = new ArrayList<>();

       customerRepo.findAll().forEach(employeeList::add);
        return  employeeList;
    }

    public employee getEmployeeById(int id){
      return  customerRepo.findById(id).get();
    }

    public employee addEmployee(employee emp){
        return customerRepo.save(emp);
    }

    public boolean deleteEmployee(int id){
         customerRepo.deleteById(id);
         return true;
    }
  public employee updateEmployee(employee emp){
        return customerRepo.save(emp);
  }

}
