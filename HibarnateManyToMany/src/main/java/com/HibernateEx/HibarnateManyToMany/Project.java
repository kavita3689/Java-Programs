package com.HibernateEx.HibarnateManyToMany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project
{
	@Id
	private int Proj_Id;
	private String Proj_Name;
	
	@ManyToMany (mappedBy = "project")
	private List<Employees> employees;

	public int getProj_Id() {
		return Proj_Id;
	}

	public void setProj_Id(int proj_Id) {
		Proj_Id = proj_Id;
	}

	public String getProj_Name() {
		return Proj_Name;
	}

	public void setProj_Name(String proj_Name) {
		Proj_Name = proj_Name;
	}

	public List<Employees> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employees> employees) {
		this.employees = employees;
	}

	public Project(int proj_Id, String proj_Name, List<Employees> employees) {
		super();
		Proj_Id = proj_Id;
		Proj_Name = proj_Name;
		this.employees = employees;
	}

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
