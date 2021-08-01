package pl.sda.start.book;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
class BookReader implements CommandLineRunner {
    private final BookService bookService;

    public BookReader(BookService bookService) {
        this.bookService = bookService;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(bookService.findAll());
    }
}
