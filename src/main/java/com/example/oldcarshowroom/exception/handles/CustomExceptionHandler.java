package com.example.oldcarshowroom.exception.handles;


import com.example.oldcarshowroom.exception.LoginFailException2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.example.oldcarshowroom.exception.LoginFailException;

import javax.persistence.EntityNotFoundException;


@ControllerAdvice
public class CustomExceptionHandler extends ResponseEntityExceptionHandler{
	@ExceptionHandler(value = {
			LoginFailException.class
	})
	protected ResponseEntity<Response> handleAuthExceptions(CrudException exception) {
		return ResponseEntity
				.status(exception.getStatus())
				.body(new Response("Error", exception.getMessage()));
	}

	@ExceptionHandler(LoginFailException2.class)
	public ResponseEntity<String> handleUnwantedException1(Exception e) {
		return ResponseEntity.badRequest().body("Wrong Username or password!!!");
	}

	@ExceptionHandler(EntityNotFoundException.class)
	public ResponseEntity<String> handleUnwantedException2(Exception e) {
		return ResponseEntity.badRequest().body("Not found!!!");
	}
	
}
