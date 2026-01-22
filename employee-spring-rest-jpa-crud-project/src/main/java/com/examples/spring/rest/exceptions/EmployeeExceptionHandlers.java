package com.examples.spring.rest.exceptions;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.examples.spring.rest.dto.ErrorResponse;

@RestControllerAdvice
public class EmployeeExceptionHandlers {

	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<Map<String, String>> 
	   handleValidationErrors(MethodArgumentNotValidException ex) {
		Map<String, String> errors = new HashMap<>();
		ex.getBindingResult().getFieldErrors()
				.forEach(error -> errors.put(error.getField(), error.getDefaultMessage()));
		return ResponseEntity.badRequest().body(errors);
	}

	@ExceptionHandler(InvalidEmployeeException.class)
	public ResponseEntity<ErrorResponse> handleInvalidEmployee(InvalidEmployeeException e) {
		ErrorResponse er = new ErrorResponse();
		er.setMessage(e.getMessage());
		er.setStatus(400);
		er.setTimestamp(LocalDateTime.now());
		return new ResponseEntity<>(er, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(EmployeeNotFound.class)
	public ResponseEntity<ErrorResponse> handleEmpoyeeNotFoud(EmployeeNotFound e) {

		ErrorResponse er = new ErrorResponse();
		er.setMessage(e.getMessage());
		er.setStatus(400);
		er.setTimestamp(LocalDateTime.now());
		return new ResponseEntity<>(er, HttpStatus.BAD_REQUEST);
	}

}
