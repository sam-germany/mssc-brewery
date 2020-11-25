package guru.springframework.msscbrewery.web.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.validation.ConstraintViolationException;
import java.util.ArrayList;
import java.util.List;

@ControllerAdvice
public class MvcExceptionHandler {

    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<List> validationErrorHandler(ConstraintViolationException e) {
        List<String> errors22 = new ArrayList<>(e.getConstraintViolations().size());

        e.getConstraintViolations().forEach(constraintViolation -> {
            errors22.add(constraintViolation.getPropertyPath() + " : " + constraintViolation.getMessage());
        });

        return  new ResponseEntity<>(errors22, HttpStatus.BAD_REQUEST);

    }

    @ExceptionHandler(BindException.class)
    public ResponseEntity<List> handleBindException(BindException ex) {

     return  new ResponseEntity(ex.getAllErrors(),HttpStatus.BAD_REQUEST);
    }
}

// open question:   new ArrayList<>(e.getConstraintViolations().size());     here he has define size for the ArrayList<>(size)
//                                                                    we can do with size or also without size must check later
