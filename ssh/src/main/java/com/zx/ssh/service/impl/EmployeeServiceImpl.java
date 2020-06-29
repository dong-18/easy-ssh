package com.zx.ssh.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zx.ssh.dao.EmployeeDao;
import com.zx.ssh.entity.Employee;
import com.zx.ssh.service.EmployeeService;


@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;
	
	
	@Override
	public List<Employee> pageEmployee(int pageNo, int pageSize) {
		// TODO Auto-generated method stub
		return employeeDao.pageEmployee(pageNo, pageSize);
	}

}
