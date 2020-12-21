package com.empapp.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.empapp.model.dao.Employee;
import com.empapp.model.dao.EmployeeDao;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao employeeDao;
	
	@Autowired
	public EmployeeServiceImpl(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	@Override
	public List<Employee> getAll() {
		return employeeDao.getAll();
	}

	@Override
	public Employee getEmployeeById(int id) {
		return employeeDao.getEmployeeById(id);
	}

	@Override
	public Employee save(Employee emp) {
		return employeeDao.save(emp);
	}

	@Override
	public Employee delete(int empId) {
		return employeeDao.delete(empId);
	}

	@Override
	public Employee update(int empId, Employee emp) {
		return employeeDao.update(empId, emp);
	}

}
