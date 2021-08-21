package pl.sda.start.book;

class Book {

    private String title;

    public Book() {
    }

    public Book(String title) {
        this.title = title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Book title: " + title;
    }
}
