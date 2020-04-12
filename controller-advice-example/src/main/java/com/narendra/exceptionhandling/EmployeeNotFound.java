package com.narendra.exceptionhandling;

public class EmployeeNotFound extends Exception{
	
	private static final long serialVersionUID = 5454352161596067472L;

	public EmployeeNotFound() {
		super();
	}
	
	public EmployeeNotFound(String message) {
		super(message);
	}
	
	

}
