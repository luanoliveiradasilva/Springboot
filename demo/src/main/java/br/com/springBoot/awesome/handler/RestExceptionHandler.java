package br.com.springBoot.awesome.handler;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import br.com.springBoot.awesome.error.ResourceNotFoundDetails;
import br.com.springBoot.awesome.error.ResourceNotFoundException;

@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<?> handlerResourceNotFoundException(ResourceNotFoundException rfnException) {
		ResourceNotFoundDetails rnfDetails = ResourceNotFoundDetails.Builder.newBuilder()
				.timestamp(new Date().getTime()).status(HttpStatus.NOT_FOUND.value()).title("Resource not found")
				.details(rfnException.getMessage()).developerMessage(rfnException.getClass().getName()).build();

		return new ResponseEntity<>(rnfDetails, HttpStatus.NOT_FOUND);
	}

	@Override
	public ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers,
			HttpStatus status, WebRequest request) {

		List<FieldError> fieldErrors = ex.getBindingResult().getFieldErrors();
		String field = fieldErrors.stream().map(FieldError::getField).collect(Collectors.joining())
		
		return handleExceptionInternal(ex, null, headers, status, request);
	}

}
