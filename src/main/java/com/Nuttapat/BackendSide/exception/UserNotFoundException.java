package com.Nuttapat.BackendSide.exception;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(Long id) {
        super("could not found the user the id "+id );
    }

}
