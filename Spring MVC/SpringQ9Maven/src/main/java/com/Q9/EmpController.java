package com.Q9;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class EmpController {

    @Autowired
    EmpDao empDao;

    @RequestMapping(value = "/viewemp/{pageNo}")
    public ModelAndView employeeView(@PathVariable int pageNo){
        ModelAndView modelAndView = new ModelAndView("EmployeePage");

        /**
         * Configuring the page number
         * when pageNo = 1  range = 1 to 5
         * when pageNo = 2 range = 6 to 10
         * so on.
         */
        int total=5;
        if(pageNo==1){}
        else{
            pageNo=(pageNo-1)*total+1;
        }
        List<Employee> list=empDao.getEmployeeByPageNO(pageNo,total) ;
        modelAndView.addObject("msg",list);
        return  modelAndView;
    }
}
