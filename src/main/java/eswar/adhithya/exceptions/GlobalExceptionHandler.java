package eswar.adhithya.exceptions;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandler {
	
@ExceptionHandler(ResourceNotFound.class)
//@ResponseStatus(value=HttpStatus.NOT_FOUND)
public ResponseEntity<ErrorDetails> resourceNotfoundCase(ResourceNotFound ex)
{
	ErrorDetails err=new ErrorDetails(ex.getMessage(),  new Date());
	System.out.println("error E "+err);
	System.out.println("Http status not found toString "+ HttpStatus.NOT_FOUND.toString());
	return new ResponseEntity<ErrorDetails>(err, HttpStatus.NOT_FOUND);
}

	

}
