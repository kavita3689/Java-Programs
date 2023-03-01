package com.HibernateEx.HibarnateOneToMany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Employee {
	@Id
	private int Emp_id;
	private String Emp_name;
	private String Emp_add;
	private int Emp_con_no;
	
	@OneToMany
	private List<Department>department;

	public int getEmp_id() {
		return Emp_id;
	}

	public void setEmp_id(int emp_id) {
		Emp_id = emp_id;
	}

	public String getEmp_name() {
		return Emp_name;
	}

	public void setEmp_name(String emp_name) {
		Emp_name = emp_name;
	}

	public String getEmp_add() {
		return Emp_add;
	}

	public void setEmp_add(String emp_add) {
		Emp_add = emp_add;
	}

	public int getEmp_con_no() {
		return Emp_con_no;
	}

	public void setEmp_con_no(int emp_con_no) {
		Emp_con_no = emp_con_no;
	}

	public List<Department> getDepartment() {
		return department;
	}

	public void setDepartment(List<Department> department) {
		this.department = department;
	}

	public Employee(int emp_id, String emp_name, String emp_add, int emp_con_no, List<Department> department) {
		super();
		Emp_id = emp_id;
		Emp_name = emp_name;
		Emp_add = emp_add;
		Emp_con_no = emp_con_no;
		this.department = department;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	


}
