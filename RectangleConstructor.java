class Rectangle {
    int length;
    int width;

    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    void calculateArea() {
        int area = length * width;
        System.out.println("Area = " + area);
    }
}

public class RectangleConstructor {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(10, 5);

        r1.calculateArea();
    }
}
