package com.Ganesh;

import org.springframework.stereotype.Component;

@Component
public class Student {
	
	
	
	public Student() {
		// TODO Auto-generated constructor stub
		System.out.println("Student Constructor");
	}
	
	
	String get() {
		
		return "Ganesh Garje".toUpperCase();
	}

}
