import java.util.Scanner;

class Book {

    String title;
    String author;
    int price;

    Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void display() {
        System.out.println("\n--- Book Details ---");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

public class BookConstructor1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter book title:");
        String title = sc.nextLine();

        System.out.println("Enter author name:");
        String author = sc.nextLine();

        System.out.println("Enter book price:");
        int price = sc.nextInt();

        Book b1 = new Book(title, author, price);

        b1.display();

        sc.close();
    }
}