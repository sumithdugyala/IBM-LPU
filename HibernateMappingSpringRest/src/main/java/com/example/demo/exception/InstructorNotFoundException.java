package com.example.demo.exception;

public class InstructorNotFoundException extends Throwable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7217385236065854679L;

	private String message;

	public InstructorNotFoundException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "InstructorNotFoundException [message=" + message + "]";
	}
}
