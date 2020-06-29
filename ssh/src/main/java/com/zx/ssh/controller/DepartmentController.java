package com.zx.ssh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zx.ssh.result.BaseResult;
import com.zx.ssh.service.DepartmentService;



@Controller
@RequestMapping("/dept")
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;
	
	@ResponseBody
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public BaseResult listDept() {
		
		return BaseResult.getBaseResult(0, "成功返回结果集", departmentService.listDepartment());
	}

}
