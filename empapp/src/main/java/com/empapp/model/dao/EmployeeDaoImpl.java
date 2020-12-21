package com.empapp.model.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class EmployeeDaoImpl implements EmployeeDao{

	private SessionFactory factory;
	
	@Autowired
	public EmployeeDaoImpl(SessionFactory factory) {
		this.factory = factory;
	}

	private Session getSession() {
		return factory.getCurrentSession();
	}
	@Override
	public List<Employee> getAll() {
		return getSession().createQuery("select e from Employee e").list();
	}

	@Override
	public Employee getEmployeeById(int id) {
		Employee employee=getSession().find(Employee.class, id);
		if(employee==null)
			throw new EmployeeNotFoundException("emp with id="+ id + " is not found");
		return employee;
	}

	@Override
	public Employee save(Employee emp) {
		 getSession().save(emp);
		 return emp;//this return object have auto gen key
	}

	@Override
	public Employee delete(int empId) {
		Employee empToDelete=getEmployeeById(empId);
		getSession().delete(empToDelete);
		return empToDelete;
	}

	@Override
	public Employee update(int empId, Employee emp) {
		Employee empToUpdate=getEmployeeById(empId);
		empToUpdate.setAge(emp.getAge());
		empToUpdate.setName(emp.getName());
		getSession().merge(empToUpdate);
		return empToUpdate;
	}

}
