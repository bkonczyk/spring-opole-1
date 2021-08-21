package pl.sda.start.book;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Profile("dev")
public class BookMockData {

    private final BookRepository repository;

    public BookMockData(BookRepository repository) {
        this.repository = repository;
    }

    @PostConstruct
    void addSampleBooks() {
        repository.add(new Book("W pustyni i w Puszczy"));
        repository.add(new Book("Janko Muzykant"));
        repository.add(new Book("Zbrodnia Ikara"));
    }
}
