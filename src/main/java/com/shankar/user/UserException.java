package com.shankar.user;

public class UserException extends RuntimeException{
    public UserException(String errorMessage){
        super(errorMessage);
    }
}
