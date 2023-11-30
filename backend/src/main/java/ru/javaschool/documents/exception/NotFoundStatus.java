package ru.javaschool.documents.exception;

public class NotFoundStatus extends RuntimeException {
    public NotFoundStatus(String message) {
        super(message);
    }
}
