package pl.sda.start.book;

import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
class BookRepository {
    private List<Book> bookList;

    @PostConstruct
    void addSampleBooks() {
        bookList = new ArrayList<>();
        bookList.add(new Book("W pustyni i w Puszczy"));
        bookList.add(new Book("Janko Muzykant"));
        bookList.add(new Book("Zbrodnia Ikara"));
    }

    List<Book> findAll() {
        return bookList;
    }

    Optional<Book> findById(Integer index) {
        try {
            return Optional.of(bookList.get(index));
        } catch (IndexOutOfBoundsException e) {
            return Optional.empty();
        }
    }
}
