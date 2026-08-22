import java.util.Scanner;

class Circle {

    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of circle = " + area);
    }

    void calculateCircumference() {
        double circumference = 2 * Math.PI * radius;
        System.out.println("Circumference = " + circumference);
    }
}

public class CircleConstructor1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius:");
        double radius = sc.nextDouble();

        Circle c1 = new Circle(radius);

        c1.calculateArea();
        c1.calculateCircumference();

        sc.close();
    }
}
