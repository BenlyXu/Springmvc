package com.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.EmployeeDao;
import com.demo.model.Employee;
import com.demo.service.EmployeeManager;

/**
 * @author Benly
 * @since Jul 11, 2015
 */
@Service
public class EmployeeManagerImpl implements EmployeeManager {

	@Autowired
	private EmployeeDao employeeDao;
	
	@Override
	public List<Employee> getAllEmployees() {
		return employeeDao.getAllEmployees();
	}

}
