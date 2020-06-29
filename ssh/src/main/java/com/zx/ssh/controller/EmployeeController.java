package com.zx.ssh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zx.ssh.result.BaseResult;
import com.zx.ssh.result.Page;
import com.zx.ssh.service.EmployeeService;



@Controller
@RequestMapping("/emp")
public class EmployeeController {
	
	private static final int PAGESIZE=10;
	
	@Autowired
	private EmployeeService employeeService;
	
	@ResponseBody
	@RequestMapping(value="/list/{page}", method=RequestMethod.GET)
	public BaseResult listEmp(@PathVariable("page") Integer page) {
		
		return BaseResult.getBaseResult(0, "成功返回结果集", 
				new Page(page, 0, employeeService.pageEmployee(page, PAGESIZE)));
	}
}
