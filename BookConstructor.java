class Book {
    String title;
    String author;
    int price;

    Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
}

public class BookConstructor {
    public static void main(String[] args) {

        Book b1 = new Book("Java Basics", "James", 500);

        System.out.println("Title: " + b1.title);
        System.out.println("Author: " + b1.author);
        System.out.println("Price: " + b1.price);
    }
}
