package ru.mail.sphere.collection;

public class UnsupportedArgumentException extends RuntimeException {
    public UnsupportedArgumentException() {
        super();
    }

    public UnsupportedArgumentException(String message) {
        super(message);
    }

    public UnsupportedArgumentException(String message, Throwable cause) {
        super(message, cause);
    }
}
