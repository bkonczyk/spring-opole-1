package pl.sda.start.book;

import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

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
}
