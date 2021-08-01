package pl.sda.start.book;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/books")
class BookController {

    private final BookService service;

    public BookController(BookService service) {
        this.service = service;
    }

    @GetMapping
    List<Book> getAllBooks() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    Book getById(@PathVariable Integer id) {
        return service.getById(id);
    }

    @GetMapping("/random")
    Book getRandomBook() {
        return service.getRandomBook();
    }
}
