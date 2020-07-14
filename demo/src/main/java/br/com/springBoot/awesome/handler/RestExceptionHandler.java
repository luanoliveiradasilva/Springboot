package br.com.springBoot.awesome.handler;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import br.com.springBoot.awesome.error.ErrorDetails;
import br.com.springBoot.awesome.error.ValidationErrorDetails;

@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

	@Override
	public ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, 
			HttpHeaders headers,
			HttpStatus status, 
			WebRequest request) {

		List<FieldError> fieldErrors = ex.getBindingResult().getFieldErrors();
		String field = fieldErrors.stream().map(FieldError::getField).collect(Collectors.joining(","));
		ValidationErrorDetails rnfDetails = ValidationErrorDetails.Builder
				.newBuilder()
				.timestamp(new Date().getTime())
				.status(HttpStatus.NOT_FOUND.value())
				.title("Resource Not Found")
				.details(ex.getMessage())
				.developerMessage(ex.getClass().getName())
				.build();
		
		return new ResponseEntity<>(rnfDetails, HttpStatus.BAD_REQUEST);
	}
	
	
	@Override
	public ResponseEntity<Object> handleHttpMessageNotReadable(
			HttpMessageNotReadableException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {

		ErrorDetails errorDetails = ErrorDetails.Builder
				.newBuilder()
				.timestamp(new Date().getTime())
				.status(HttpStatus.NOT_FOUND.value())
				.title("Resource Not Found")
				.details(ex.getMessage())
				.developerMessage(ex.getClass().getName())
				.build();
		
		return new ResponseEntity<>(errorDetails, HttpStatus.BAD_REQUEST);
	}

}
