class Product {
    String name;
    int productId;
    double price;
    int quantity;

    
    Product() {
        this("Unknown", 0, 0.0, 0);
    }

   
    Product(String name) {
        this(name, 0, 0.0, 0);
    }

   
    Product(String name, double price) {
        this(name, 0, price, 1);
    }

    Product(String name, int productId, double price, int quantity) {
        this.name = name;
        this.productId = productId;
        this.price = price;
        this.quantity = quantity;
    }

    void display() {
        System.out.println("Product: " + name);
        System.out.println("ID: " + productId);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("--------------------");
    }
}

public class ProductOverloading {
    public static void main(String[] args) {

        Product p1 = new Product();

        Product p2 = new Product("Laptop");

        Product p3 = new Product("Mouse", 800);

        Product p4 = new Product("Keyboard", 104, 2500, 2);

        p1.display();
        p2.display();
        p3.display();
        p4.display();
    }
}
