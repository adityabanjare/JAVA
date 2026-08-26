import java.util.Scanner;

class Product {
    String name;
    double price;
    int quantity;
    String category;

    // Constructor 1
    Product() {
        this.name = "Unknown";
        this.price = 0;
        this.quantity = 0;
        this.category = "General";
    }

    // Constructor 2
    Product(String name) {
        this.name = name;
        this.price = 0;
        this.quantity = 0;
        this.category = "General";
    }

    // Constructor 3
    Product(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantity = 1;
        this.category = "General";
    }

    // Constructor 4
    Product(String name, double price, int quantity, String category) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
    }

    void display() {
        System.out.println("\n----- Product Details -----");
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Category: " + category);
    }
}

public class ProductConstructorOverloading {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Default Product");
        System.out.println("2. Product Name");
        System.out.println("3. Product Name + Price");
        System.out.println("4. Full Product Details");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        sc.nextLine();

        Product p1;

        if (choice == 1) {

            p1 = new Product();

        } 
        else if (choice == 2) {

            System.out.print("Enter product name: ");
            String name = sc.nextLine();

            p1 = new Product(name);

        } 
        else if (choice == 3) {

            System.out.print("Enter product name: ");
            String name = sc.nextLine();

            System.out.print("Enter product price: ");
            double price = sc.nextDouble();

            p1 = new Product(name, price);

        } 
        else if (choice == 4) {

            System.out.print("Enter product name: ");
            String name = sc.nextLine();

            System.out.print("Enter product price: ");
            double price = sc.nextDouble();

            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter category: ");
            String category = sc.nextLine();

            p1 = new Product(name, price, quantity, category);

        } 
        else {

            System.out.println("Invalid choice");
            p1 = new Product();
        }

        p1.display();

        sc.close();
    }
}
