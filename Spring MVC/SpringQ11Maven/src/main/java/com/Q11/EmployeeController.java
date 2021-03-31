package com.Q11;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

@Controller
public class EmployeeController {

    @RequestMapping("/toPdf")
    public ModelAndView toPdf(){
        List<Employee> employeeList = Arrays.asList(
                new Employee(1111,"John",20000),
                new Employee(2222,"jack",50000),
                new Employee(33333,"Tom",300000)
        );

        ModelAndView modelAndView = new ModelAndView(new PdfReportView());
        modelAndView.addObject("empList",employeeList);
        return  modelAndView;
    }

}
