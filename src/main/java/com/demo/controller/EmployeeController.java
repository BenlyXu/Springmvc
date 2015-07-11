package com.demo.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.model.Employee;
import com.demo.service.EmployeeManager;

/**
 * @author Benly
 * @since Jul 11, 2015
 */
@Controller
public class EmployeeController {

	@Autowired
	private EmployeeManager employeeManager;
	
	@RequestMapping(value="/employees")
	public String getAllEmployees(HttpServletRequest req, HttpServletResponse res, ModelMap map) {
		List<Employee> list = employeeManager.getAllEmployees();
		for (Employee employee : list) {
			System.out.println(employee.toString());
		}
		map.put("test", "hello world");
		map.put("employees", list);
		return "employeeList";
	}
	
}
