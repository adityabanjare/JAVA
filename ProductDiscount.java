import java.util.Scanner;

class Product {

    String name;
    int price;
    int discount;

    Product(String name, int price, int discount) {
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    void calculateFinalPrice() {

        int discountAmount = price * discount / 100;
        int finalPrice = price - discountAmount;

        System.out.println("\nProduct: " + name);
        System.out.println("Original Price: " + price);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Price: " + finalPrice);
    }
}

public class ProductDiscount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product name:");
        String name = sc.nextLine();

        System.out.println("Enter product price:");
        int price = sc.nextInt();

        System.out.println("Enter discount percentage:");
        int discount = sc.nextInt();

        Product p1 = new Product(name, price, discount);

        p1.calculateFinalPrice();

        sc.close();
    }
}
