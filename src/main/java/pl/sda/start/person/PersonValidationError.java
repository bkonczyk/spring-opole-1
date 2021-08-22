package pl.sda.start.person;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor(staticName = "of")
public class PersonValidationError {
    private LocalDateTime timestamp;
    private Short status;
    private String error;
    private String path;
    private String message;
}
