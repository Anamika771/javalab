package tutorial;

public class Book {
    String title;
    String author;
    double price;

    Book(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    void displayBook() {
        System.out.println("Title : " + title);
        System.out.println("Author: " + author);
        System.out.println("Price : " + price);
        System.out.println();
    }

    public static void main(String[] args) {
        Book b1 = new Book("hunny bunny", "annmariya", 650);
        Book b2 = new Book("lion", "greta", 550);

        System.out.println("Book 1 Details:");
        b1.displayBook();

        System.out.println("Book 2 Details:");
        b2.displayBook();
    }
}