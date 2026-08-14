
import java.util.Scanner;

public class SumPositiveElements {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size:");
        int n = sc.nextInt();

        int a[] = new int[n];
        int sum = 0;

        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();

            if (a[i] > 0) {
                sum = sum + a[i];
            }
        }

        System.out.println("Sum of positive elements = " + sum);

        sc.close();
    }
}