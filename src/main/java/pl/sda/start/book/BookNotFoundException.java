package pl.sda.start.book;

class BookNotFoundException extends RuntimeException {

    public BookNotFoundException(String title) {
        super("Book: " + title + " not found.");
    }

    public BookNotFoundException(Integer index) {
        super("Book with index: " + index + " doesn't exist");
    }
}
