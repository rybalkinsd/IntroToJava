package ru.mail.sphere.exception;

public class BaseException extends Exception {

    public BaseException(String message) {
        super("BaseException: " + message);
    }
}
