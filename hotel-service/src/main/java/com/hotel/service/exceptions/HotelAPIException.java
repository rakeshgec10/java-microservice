package com.hotel.service.exceptions;

import org.springframework.http.HttpStatus;

public class HotelAPIException extends RuntimeException {
private static final long serialVersionUID = 1L;
// we throw this exception whenever we write some business logic
    // or validate request parameters

    private HttpStatus httpStatus;
    private String message;

    public HotelAPIException(HttpStatus httpStatus, String message) {
        this.httpStatus = httpStatus;
        this.message = message;
    }

    public HotelAPIException(String message, HttpStatus httpStatus, String message1) {
        super(message);
        this.httpStatus = httpStatus;
        this.message = message1;
    }





}
