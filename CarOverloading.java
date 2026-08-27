import java.util.Scanner;

class Car {
    String brand;
    String model;
    int year;
    double price;

    Car() {
        this.brand = "Unknown";
        this.model = "Unknown";
        this.year = 0;
        this.price = 0;
    }

    Car(String brand) {
        this.brand = brand;
        this.model = "Unknown";
        this.year = 0;
        this.price = 0;
    }

    Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = 0;
    }

    Car(String brand, String model, int year, double price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: " + price);
    }
}

public class CarOverloading {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Default");
        System.out.println("2. Brand");
        System.out.println("3. Brand + Model + Year");
        System.out.println("4. All Details");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        sc.nextLine();

        Car car;

        if (choice == 1) {
            car = new Car();
        }
        else if (choice == 2) {
            System.out.print("Enter brand: ");
            String brand = sc.nextLine();

            car = new Car(brand);
        }
        else if (choice == 3) {
            System.out.print("Enter brand: ");
            String brand = sc.nextLine();

            System.out.print("Enter model: ");
            String model = sc.nextLine();

            System.out.print("Enter year: ");
            int year = sc.nextInt();

            car = new Car(brand, model, year);
        }
        else if (choice == 4) {
            System.out.print("Enter brand: ");
            String brand = sc.nextLine();

            System.out.print("Enter model: ");
            String model = sc.nextLine();

            System.out.print("Enter year: ");
            int year = sc.nextInt();

            System.out.print("Enter price: ");
            double price = sc.nextDouble();

            car = new Car(brand, model, year, price);
        }
        else {
            System.out.println("Invalid choice");
            return;
        }

        car.display();

        sc.close();
    }
}