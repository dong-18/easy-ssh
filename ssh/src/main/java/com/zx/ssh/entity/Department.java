package com.zx.ssh.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name="department")
//@Cacheable
//@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Department {
	
	@Id
	@Column(name="dept_id")
	private int deptId;
	
	@Column(name="deptName", length=32, nullable=false)
	private String deptName;
	
	@OneToMany(mappedBy="department")
	private Set<Employee> emps = new HashSet<Employee>();

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

//	public Set<Employee> getEmps() {
//		return emps;
//	}
//
//	public void setEmps(Set<Employee> emps) {
//		this.emps = emps;
//	}

	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + "]";
	}


}
