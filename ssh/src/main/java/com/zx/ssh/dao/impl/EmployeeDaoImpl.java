package com.zx.ssh.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.zx.ssh.dao.EmployeeDao;
import com.zx.ssh.entity.Employee;

@Repository
@Transactional
public class EmployeeDaoImpl implements EmployeeDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	protected Session getCurrentSession() {
		return this.sessionFactory.getCurrentSession();
	}

	@Override
	public List<Employee> pageEmployee(int pageNo, int pageSize) {
		// TODO Auto-generated method stub
		String hql = "from Employee e order by e.empId desc";
		Query query = this.getCurrentSession().createQuery(hql);
		return query.setFirstResult((pageNo-1)*pageSize)
				.setMaxResults(pageSize).getResultList();
	}

}
