package com.HibernateEx.HibernateOneToOne;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Laptop 
{
	@Id
	private int Mod_no;
	private String lap_name;
	
	@OneToOne
	Student student;

	public int getMod_no() {
		return Mod_no;
	}

	public void setMod_no(int mod_no) {
		Mod_no = mod_no;
	}

	public String getLap_name() {
		return lap_name;
	}

	public void setLap_name(String lap_name) {
		this.lap_name = lap_name;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Laptop(int mod_no, String lap_name, Student student) {
		super();
		Mod_no = mod_no;
		this.lap_name = lap_name;
		this.student = student;
	}

	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
