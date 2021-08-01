package pl.sda.start.book;

class BookNotFoundException extends RuntimeException {

    public BookNotFoundException(String index) {
        super("Book with index: " + index + " doesn't exist");
    }
}
