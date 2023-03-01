package com.HibernateEx.HibarnateOneToMany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Department {
	@Id
	private int Dep_id;
	private String Dep_name;
	

	@ManyToOne
	Employee employee;
	
	public String getDep_name() {
		return Dep_name;
	}
	
	public void setDep_name(String dep_name) {
		Dep_name = dep_name;
	}
	
	public int getDep_id() {
		return Dep_id;
	}
	
	public void setDep_id(int dep_id) {
		Dep_id = dep_id;
	}
	
	public Employee getEmployee() {
		return employee;
	}
	
	public void setEmployee(Employee employee) {
		this.employee = employee;
		
	}
	
	public Department(String dep_name, int dep_id, Employee employee) {
		super();
		Dep_name = dep_name;
		Dep_id = dep_id;
		this.employee = employee;
		
	}
	
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

}
