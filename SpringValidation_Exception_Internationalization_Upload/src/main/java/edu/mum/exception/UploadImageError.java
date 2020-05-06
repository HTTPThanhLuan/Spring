package edu.mum.exception;

public class UploadImageError extends RuntimeException {
    private String message;

    public UploadImageError(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
