package pl.sda.start.exception;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/exception")
@Profile("dev")
public class ExceptionController {

    @Value("${sda.start.exception.message}")
    String message;

    @GetMapping
    void throwException() {
        throw new TrainingException(message);
    }
}
