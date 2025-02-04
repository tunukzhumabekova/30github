package org.example.github.exception.exception;

public class AuthenticationException extends RuntimeException {
    public AuthenticationException(String message){
        super(message);
    }
}