package com.zx.ssh.service;

import java.util.List;

import com.zx.ssh.entity.Employee;



public interface EmployeeService {
	
	public List<Employee> pageEmployee(int pageNo, int pageSize);

}
