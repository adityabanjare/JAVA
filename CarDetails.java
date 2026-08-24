import java.util.Scanner;

class Car {

    String brand;
    String model;
    int price;

    
    Car(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }


    void display() {
        System.out.println("\n--- Car Details ---");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }

    void checkPrice() {
        if (price >= 1000000) {
            System.out.println("This is an expensive car");
        } else {
            System.out.println("This is an affordable car");
        }
    }
}

public class CarDetails {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter car brand:");
        String brand = sc.nextLine();

        System.out.println("Enter car model:");
        String model = sc.nextLine();

        System.out.println("Enter car price:");
        int price = sc.nextInt();

        
        Car c1 = new Car(brand, model, price);

    
        c1.display();
        c1.checkPrice();

        sc.close();
    }
}
