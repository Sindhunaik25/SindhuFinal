package com.project.goshopping;

public class InvalidUserException extends RuntimeException {
	public String msg;

	public InvalidUserException(String msg) {
		super(msg);

}
}
