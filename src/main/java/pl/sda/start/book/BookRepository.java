package pl.sda.start.book;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
class BookRepository {
    private final List<Book> bookList;

    public BookRepository() {
        this.bookList = new ArrayList<>();
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

    void add(Book book) {
        bookList.add(book);
    }

    void delete(int id) {
        bookList.remove(id);
    }

    Optional<Book> findByTitle(String title) {
        return bookList.stream().filter(book -> book.getTitle().equalsIgnoreCase(title)).findFirst();
    }
}
