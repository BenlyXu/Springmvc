package com.demo.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.demo.dao.EmployeeDao;
import com.demo.model.Employee;

/**
 * @author Benly
 * @since Jul 11, 2015
 */
@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> employeeList = new ArrayList<Employee>(2);
		Employee e1 = new Employee(1, "Lokesh", "Gupta");
		Employee e2 = new Employee(2, "Raj", "Kishore");
		employeeList.add(e1);
		employeeList.add(e2);
		return employeeList;
	}

}
