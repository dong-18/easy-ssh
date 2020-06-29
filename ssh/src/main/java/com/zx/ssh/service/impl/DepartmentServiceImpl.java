package com.zx.ssh.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zx.ssh.dao.DepartmentDao;
import com.zx.ssh.entity.Department;
import com.zx.ssh.service.DepartmentService;


@Service
public class DepartmentServiceImpl implements DepartmentService {
	
	@Autowired
	private DepartmentDao departmentDao;

	@Override
	public List<Department> listDepartment() {
		// TODO Auto-generated method stub
		return departmentDao.listDepartment();
	}

}
