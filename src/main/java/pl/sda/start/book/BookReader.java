package pl.sda.start.book;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "sda.start.book")
class BookReader implements CommandLineRunner {
    private final BookService bookService;
    private final BookSeller bookSeller;

    private String firstAuthor;
    private String secondAuthor;

    public void setFirstAuthor(String firstAuthor) {
        this.firstAuthor = firstAuthor;
    }

    public void setSecondAuthor(String secondAuthor) {
        this.secondAuthor = secondAuthor;
    }

    public BookReader(BookService bookService, BookSeller veryExpensiveBookSeller) {
        this.bookService = bookService;
        this.bookSeller = veryExpensiveBookSeller;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(bookService.findAll());

        System.out.println(firstAuthor);
        System.out.println(secondAuthor);

        bookSeller.sell();
    }
}
