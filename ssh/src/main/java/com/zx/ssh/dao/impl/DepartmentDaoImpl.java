package com.zx.ssh.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.zx.ssh.dao.DepartmentDao;
import com.zx.ssh.entity.Department;

@Repository
@Transactional
public class DepartmentDaoImpl implements DepartmentDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	protected Session getCurrentSession() {
		return this.sessionFactory.getCurrentSession();
	}

	@Override
	public List<Department> listDepartment() {
		// TODO Auto-generated method stub
		String hql = "from Department";
		Query query = this.getCurrentSession().createQuery(hql);
		return query.getResultList();
	}

}
