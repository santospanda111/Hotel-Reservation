package com.hotelreservation;

public class InvalidDateError extends Exception{
    public InvalidDateError(String message){
        super(message);
    }
}
