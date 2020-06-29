package com.zx.ssh.dao;

import java.util.List;

import com.zx.ssh.entity.Employee;

public interface EmployeeDao {

	public List<Employee> pageEmployee(int pageNo, int pageSize);
}
