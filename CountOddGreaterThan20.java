import java.util.Scanner;

public class CountOddGreaterThan20 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size:");
        int n = sc.nextInt();

        int a[] = new int[n];
        int count = 0;

        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();

            if (a[i] % 2 != 0 && a[i] > 20) {
                count++;
            }
        }

        System.out.println("Odd numbers greater than 20 = " + count);

        sc.close();
    }
}
