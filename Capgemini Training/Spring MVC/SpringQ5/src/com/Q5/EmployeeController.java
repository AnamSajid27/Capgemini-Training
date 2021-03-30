package com.Q5;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.http.MockHttpOutputMessage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sun.org.apache.regexp.internal.recompile;

import sun.print.resources.serviceui;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeDAO employeeDao;
	
	@RequestMapping(value = "/addEmployee.html",method = RequestMethod.GET)
	public ModelAndView addEmployee() {
		ModelAndView modelAndView = new ModelAndView("EmployeeForm");
		return modelAndView;
	}
	
	@RequestMapping(value ="/InsertEmployee.html",method =RequestMethod.POST)
	public ModelAndView updateEmployee(@ModelAttribute ("employee")Employee employee) throws Exception {
		employeeDao.insertUser(employee);
		/*
		ResultSet set=employeeDao.getDetails();
		List<Employee> list = new ArrayList<>();
		while(set.next()) {
			Employee e = new Employee();
			e.setEmployeeId(set.getInt(1));
			e.setEmployeeName(set.getString(2));
			e.setEmployeeDepartment(set.getString(3));
			e.setEmployeeDesignation(set.getString(4));
			e.setEmployeeSalary(set.getInt(5));
			list.add(e);
		}
		*/
		ModelAndView modelAndView = new ModelAndView("employeeDetail");

		return modelAndView;
	}
	
	@RequestMapping("/deleteEmployee.html/{userId}")
	public ModelAndView deleteEmployee(@PathVariable ("userId") int userId)throws Exception {
		
		employeeDao.deleteEmployee(userId);
		ModelAndView modelAndView = new ModelAndView("employeeDetail");
		modelAndView.addObject("msg",userId);
		return modelAndView;
	}
	
	@RequestMapping("/editEmployeeDetail/{userId}")
	public ModelAndView editEmployee(@PathVariable ("userId") int userId) {
		ModelAndView modelAndView = new ModelAndView("updateEmployee");
		modelAndView.addObject("userId",userId);
		return modelAndView;
	}
	
	@RequestMapping(value = "/updateEmployee.html",method = RequestMethod.POST)
	public ModelAndView updateDetails(@ModelAttribute ("employee")Employee employee) throws Exception {
		employeeDao.updateDetails(employee);
		ModelAndView modelAndView = new ModelAndView("employeeDetail");
		modelAndView.addObject("msg",employee);
		return modelAndView;
	}
	

}
