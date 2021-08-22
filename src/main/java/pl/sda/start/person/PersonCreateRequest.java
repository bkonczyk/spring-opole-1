package pl.sda.start.person;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.pl.PESEL;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonCreateRequest {

    @NotNull(message = "Name cannot be null")
    private String name;

    @NotNull(message = "Last name cannot be null")
    private String lastName;

    @Min(value = 18, message = "Adults only")
    @Max(value = 100, message = "You're too old")
    private Integer age;

    @PESEL(message = "Invalid pesel")
    private String pesel;
}
