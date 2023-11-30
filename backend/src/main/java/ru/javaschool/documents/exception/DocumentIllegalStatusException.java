package ru.javaschool.documents.exception;

public class DocumentIllegalStatusException extends RuntimeException {
    public DocumentIllegalStatusException(String message) {
        super(message);
    }
}
