package com.example.oldcarshowroom.exception;

import org.springframework.http.HttpStatus;

import com.example.oldcarshowroom.exception.handles.CrudException;

public class LoginFailException extends CrudException {
	public LoginFailException() {
		super("Wrong username or password", HttpStatus.BAD_REQUEST);
	}
}
