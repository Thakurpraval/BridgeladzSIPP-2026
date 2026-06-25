class LibraryBook {

    String title;
    String author;
    double price;
    boolean available;

    LibraryBook(String title,
                String author,
                double price) {

        this.title = title;
        this.author = author;
        this.price = price;
        this.available = true;
    }

    void borrowBook() {

        if (available) {
            available = false;
            System.out.println(title + " borrowed successfully.");
        } else {
            System.out.println(title + " is not available.");
        }
    }

    void display() {

        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Available: " + available);
    }
}

public class LibraryBookDemo {

    public static void main(String[] args) {

        LibraryBook book =
                new LibraryBook(
                        "Java Basics",
                        "Author A",
                        450);

        book.display();

        System.out.println();

        book.borrowBook();

        System.out.println();

        book.display();
    }
}