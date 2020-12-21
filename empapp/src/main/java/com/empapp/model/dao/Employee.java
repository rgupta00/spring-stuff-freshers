package com.empapp.model.dao;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
@Table(name="emp_table")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private int age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Employee() {}
	
	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	
}
