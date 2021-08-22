package pl.sda.start.person;

import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class PersonExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    PersonValidationError handlePersonException(MethodArgumentNotValidException e) {
        String message = extractErrorMessage(e);
        return PersonValidationError.of(
                LocalDateTime.now(),
                (short) 400,
                "Bad request",
                "api/people",
                message);
    }

    private String extractErrorMessage(MethodArgumentNotValidException e) {
        return e.getBindingResult()
                .getAllErrors()
                .stream()
                .findFirst()
                .map(DefaultMessageSourceResolvable::getDefaultMessage)
                .orElse("");
    }
}
