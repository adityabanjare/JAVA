class Circle {
    float radius;

    Circle(float radius) {
        this.radius = radius;
    }

    void calculateArea() {
        float area = 3.14f * radius * radius;
        System.out.println("Area = " + area);
    }
}

public class CircleConstructor {
    public static void main(String[] args) {

        Circle c1 = new Circle(5);

        c1.calculateArea();
    }
}