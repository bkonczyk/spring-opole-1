package pl.sda.start.person;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PersonService {

    private final PersonRepository repository;

    public void createPerson(PersonCreateRequest request) {
        Person person = mapToPerson(request);
        repository.save(person);
    }

    private Person mapToPerson(PersonCreateRequest request) {
        return Person.builder()
                .name(request.getName())
                .lastName(request.getLastName())
                .age(request.getAge())
                .pesel(request.getPesel())
                .build();
    }
}
