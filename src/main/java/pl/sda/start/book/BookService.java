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
                .orElseThrow(() -> new BookNotFoundException(id));
    }

    public Book getRandomBook() {
        Integer randomInteger = new Random().nextInt(findAll().size());
        return getById(randomInteger);
    }

    public void add(Book book) {
        bookRepository.add(book);
    }

    public void delete(Integer id) {
        try {
            bookRepository.delete(id);
        } catch (IndexOutOfBoundsException e) {
            throw new BookNotFoundException(id);
        }
    }

    public void update(Integer id, Book request) {
        Book book = getById(id);
        book.setTitle(request.getTitle());
    }

    public Book findByTitle(String title) {
        return bookRepository.findByTitle(title).orElseThrow(() -> new BookNotFoundException(title));
    }
}
