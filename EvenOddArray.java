import java.util.Scanner;

public class EvenOddArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a[] = new int[5];

        System.out.println("Enter 5 numbers:");

        // Input
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Even numbers:");

        // Even numbers
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                System.out.println(a[i]);
            }
        }

        System.out.println("Odd numbers:");

        // Odd numbers
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                System.out.println(a[i]);
            }
        }

        sc.close();
    }
}