package com.empapp.model.dao;

import java.util.List;

public interface EmployeeDao {
	public List<Employee> getAll();
	public Employee getEmployeeById(int id);
	public Employee save(Employee emp);
	public Employee delete(int empId);
	public Employee update(int empId, Employee emp);
}
