package pl.sda.start.book;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    public Book getById(Integer id) {
        return bookRepository
                .findById(id)
                .orElseThrow(() -> new BookNotFoundException(id.toString()));
    }

    public Book getRandomBook() {
        Integer randomInteger = new Random().nextInt(findAll().size());
        return getById(randomInteger);
    }
}
