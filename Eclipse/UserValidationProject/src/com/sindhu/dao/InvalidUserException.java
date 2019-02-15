package com.sindhu.dao;

public class InvalidUserException extends RuntimeException {
	public String msg;

	public InvalidUserException(String msg) {
		super(msg);

	}

}
