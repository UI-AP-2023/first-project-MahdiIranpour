package com.example.fase2.exceptions;

public class InvalidProductNumber extends Throwable {

    public InvalidProductNumber(String message){

        super(message);
    }

    public InvalidProductNumber(){
        super("Invalid Product number");
    }
}