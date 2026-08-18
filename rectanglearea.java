import java.util.Scanner;

class Rectangle {
    int length;
    int width;

    void calculateArea() {
        int area = length * width;
        System.out.println("Area = " + area);
    }
}

public class rectanglearea {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Rectangle r1 = new Rectangle();

        System.out.println("Enter length:");
        r1.length = sc.nextInt();

        System.out.println("Enter width:");
        r1.width = sc.nextInt();

        r1.calculateArea();

        sc.close();
    }
}