package com.example.oldcarshowroom.exception.handles;


import com.example.oldcarshowroom.exception.LoginFailException2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.example.oldcarshowroom.exception.LoginFailException;

import javax.persistence.EntityNotFoundException;
import static com.example.oldcarshowroom.config.CommonUtils.switchException;

@ControllerAdvice
@Slf4j
public class CustomExceptionHandler extends ResponseEntityExceptionHandler{
	@ExceptionHandler(value = {
			LoginFailException.class
	})
	protected ResponseEntity<Response> handleAuthExceptions(CrudException exception) {
		return ResponseEntity
				.status(exception.getStatus())
				.body(new Response("Error", exception.getMessage()));
	}

//	@ExceptionHandler(LoginFailException2.class)
//	public ResponseEntity<String> handleUnwantedException1(Exception e) {
//		return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(e.getMessage());
//	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<?> handleUnwantedException(Exception e) {
		log.warn(e.toString());
		return switchException(e);
	}


}
