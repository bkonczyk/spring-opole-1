package pl.sda.start.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class TrainingExceptionHandler {

    @ExceptionHandler(TrainingException.class)
    @ResponseStatus(HttpStatus.I_AM_A_TEAPOT)
    ErrorResponse handleTrainingException(TrainingException e){
        return new ErrorResponse(e.getMessage());
    }
}
