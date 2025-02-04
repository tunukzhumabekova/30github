package org.example.github.exception.exception;

public class AlreadyExistsException extends RuntimeException {
    public AlreadyExistsException(String message){
        super(message);
    }
}
