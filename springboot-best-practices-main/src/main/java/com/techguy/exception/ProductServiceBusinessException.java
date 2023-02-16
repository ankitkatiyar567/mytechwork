package com.techguy.exception;

public class ProductServiceBusinessException extends RuntimeException{

    public ProductServiceBusinessException(String message) {
        super(message);
    }
}
