package com.example.MovieTicket.MovieBooking.service;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class IdAlreadyExistException extends RuntimeException {
    public IdAlreadyExistException(String message) {
        super(message);
    }
}
