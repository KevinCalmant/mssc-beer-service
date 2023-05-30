package fr.kecal.msscbeerservice.web.controller;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.ConstraintViolationException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MvcExceptionHandler {
    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<List<String>> validationErrorHandler(ConstraintViolationException ex) {
        List<String> errorsList = ex.getConstraintViolations().stream()
            .map(ConstraintViolation::toString)
            .toList();
        return new ResponseEntity<>(errorsList, HttpStatus.BAD_REQUEST);
    }
}
