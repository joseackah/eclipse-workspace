package com.learningSpring.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("inst2")
@Scope("prototype")
public class Instructor {
	
	private int id;
	private String name;
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
		return "Instructor [id = " + id + ", name = " + name + "]";
	}

}
