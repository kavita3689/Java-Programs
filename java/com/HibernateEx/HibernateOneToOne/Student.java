package com.HibernateEx.HibernateOneToOne;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Student
{	
	@Id
	private int std_id;
	private String std_name;
	private int cont_no;
	private String addr;
	
	@OneToOne
	Laptop latop;

	public int getStd_id() {
		return std_id;
	}

	public void setStd_id(int std_id) {
		this.std_id = std_id;
	}

	public String getStd_name() {
		return std_name;
	}

	public void setStd_name(String std_name) {
		this.std_name = std_name;
	}

	public int getCont_no() {
		return cont_no;
	}

	public void setCont_no(int cont_no) {
		this.cont_no = cont_no;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public Laptop getLatop() {
		return latop;
	}

	public void setLatop(Laptop latop) {
		this.latop = latop;
	}

	public Student(int std_id, String std_name, int cont_no, String addr, Laptop latop) {
		super();
		this.std_id = std_id;
		this.std_name = std_name;
		this.cont_no = cont_no;
		this.addr = addr;
		this.latop = latop;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
