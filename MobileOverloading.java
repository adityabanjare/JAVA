class Mobile {
    String brand;
    String model;
    int price;

    // 1. Default constructor
    Mobile() {
        this("Unknown", "Unknown", 0);
    }

    // 2. Constructor with brand
    Mobile(String brand) {
        this(brand, "Unknown", 0);
    }

    // 3. Constructor with brand and model
    Mobile(String brand, String model) {
        this(brand, model, 0);
    }

    // 4. Constructor with all values
    Mobile(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
        System.out.println("----------------");
    }
}

public class MobileOverloading {
    public static void main(String[] args) {

        Mobile m1 = new Mobile();

        Mobile m2 = new Mobile("Samsung");

        Mobile m3 = new Mobile("Samsung", "S25");

        Mobile m4 = new Mobile("Samsung", "S25 Ultra", 120000);

        m1.display();
        m2.display();
        m3.display();
        m4.display();
    }
}
