package br.com.springBoot.awesome.handler;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import br.com.springBoot.awesome.error.ResourceNotFoundDetails;
import br.com.springBoot.awesome.error.ResourceNotFoundException;

@ControllerAdvice
public class RestExceptionHandler {

	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<?> handlerResourceNotFoundException(ResourceNotFoundException rfnException){
		ResourceNotFoundDetails rnfDetails = ResourceNotFoundDetails.Builder
		.newBuilder()
		.timestamp(new Date().getTime())
		.status(HttpStatus.NOT_FOUND.value())
		.title("Resource not found")
		.details(rfnException.getMessage())
		.developerMessage(rfnException.getClass().getName())
		.build();
		
		return new ResponseEntity<>(rnfDetails, HttpStatus.NOT_FOUND);
	}
	
	
}
