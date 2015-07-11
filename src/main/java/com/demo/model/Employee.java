package com.demo.model;

import java.io.Serializable;

import lombok.Data;

/**
 * @author Benly
 * @since Jul 11, 2015
 */
@Data
public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	
	private String firstName;
	
	private String lastName;
	
	public Employee() {
		
	}
	
	public Employee(Integer id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}

}
