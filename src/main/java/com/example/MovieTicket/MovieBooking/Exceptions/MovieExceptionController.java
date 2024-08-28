package com.example.MovieTicket.MovieBooking.Exceptions;

import com.example.MovieTicket.MovieBooking.service.IdAlreadyExistException;
import com.example.MovieTicket.MovieBooking.service.IdNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MovieExceptionController {

    @ExceptionHandler(value = IdNotFoundException.class)
    public ResponseEntity<Object> exception(IdNotFoundException exception) {
        return new ResponseEntity<>("Movie not found", HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(value = IdAlreadyExistException.class)
    public ResponseEntity<Object> exception(IdAlreadyExistException exception) {
        return new ResponseEntity<>("Movie ID already exists", HttpStatus.NOT_FOUND);
    }
}