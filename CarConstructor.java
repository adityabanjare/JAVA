
class Car {
    String brand;
    int price;

    Car(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }
}

public class CarConstructor {
    public static void main(String[] args) {

        Car c1 = new Car("Toyota", 800000);

        System.out.println("Brand: " + c1.brand);
        System.out.println("Price: " + c1.price);
    }
}