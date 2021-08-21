package pl.sda.start.exception;

import java.time.ZonedDateTime;

class ErrorResponse {
    private final String message;
    private final ZonedDateTime timeStamp;

    public ErrorResponse(String message) {
        this.message = message;
        timeStamp = ZonedDateTime.now();
    }

    public String getMessage() {
        return message;
    }

    public ZonedDateTime getTimeStamp() {
        return timeStamp;
    }
}
