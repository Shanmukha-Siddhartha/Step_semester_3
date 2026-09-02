package object_oriented_programming.assignment_problems;

public class LibraryBook {
    String title;
    String author;
    String isbn;

    LibraryBook(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    LibraryBook(String title, String author) {
        this(title, author, "PENDING");
    }

    void printBook() {
        System.out.println(title + " - " + author + " - ISBN: " + isbn);
    }

    public static void main(String[] args) {
        LibraryBook[] books = {
                new LibraryBook("Clean Code", "Robert Martin", "9780132350884"),
                new LibraryBook("Java Basics", "James Gosling"),
                new LibraryBook("Effective Java", "Joshua Bloch", "9780134685991")
        };

        for (LibraryBook book : books) {
            book.printBook();
        }
    }
}