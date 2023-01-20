package com.hibtut.hibernate1;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="student")
public class MyStudent {
	@Id
	private int id;
	private String name;
	
	public MyStudent() {
		
	}
	public MyStudent(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
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
	@Override
	public String toString() {
		return "MyStudent [id=" + id + ", name=" + name + "]";
	}
	
	
	
}
