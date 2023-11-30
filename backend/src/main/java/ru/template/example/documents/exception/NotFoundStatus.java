package ru.template.example.documents.exception;

public class NotFoundStatus extends RuntimeException {
    public NotFoundStatus(String message) {
        super(message);
    }
}
