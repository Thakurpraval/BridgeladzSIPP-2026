class Book {

    static String libraryName = "Central Library";

    String title;
    String author;
    final String isbn;

    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    static void displayLibraryName() {
        System.out.println("Library: " + libraryName);
    }

    void display() {
        System.out.println(title + " | " + author + " | " + isbn);
    }
}

public class BookDemo {

    public static void main(String[] args) {

        Book b1 = new Book(
                "Java Programming",
                "James Gosling",
                "ISBN001");

        if (b1 instanceof Book) {
            b1.display();
        }

        Book.displayLibraryName();
    }
}