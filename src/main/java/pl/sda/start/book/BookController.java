package pl.sda.start.book;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    void add(@RequestBody Book book) {
        service.add(book);
    }

    @DeleteMapping("/{id}")
    void delete(@PathVariable Integer id) {
        service.delete(id);
    }

    @PutMapping("/{id}")
    void update(@PathVariable Integer id, @RequestBody Book book) {
        service.update(id, book);
    }

    @GetMapping("/search")
    public Book searchBook(@RequestParam String title) {
        return service.findByTitle(title);
    }
}
