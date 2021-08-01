package pl.sda.start.book;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
class BookReader implements CommandLineRunner {
    private final BookService bookService;
    private final BookSeller bookSeller;

    public BookReader(BookService bookService, BookSeller veryExpensiveBookSeller) {
        this.bookService = bookService;
        this.bookSeller = veryExpensiveBookSeller;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(bookService.findAll());

        bookSeller.sell();
    }
}
