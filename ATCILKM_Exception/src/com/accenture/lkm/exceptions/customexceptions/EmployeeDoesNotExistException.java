package com.accenture.lkm.exceptions.customexceptions;

public class EmployeeDoesNotExistException extends  Exception{
 
	private static final long serialVersionUID = 1L;

	public EmployeeDoesNotExistException(String message) {
		super(message);
 	}

}
