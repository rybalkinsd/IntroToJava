package ru.mail.sphere.exception;

public class SubException extends BaseException {

    public SubException(String message) {
        super("SubException: " + message);
    }
}
