import java.util.Scanner;

public class MaximumDifference {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size:");
        int n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        int largest = a[0];
        int smallest = a[0];

        for (int i = 1; i < a.length; i++) {

            if (a[i] > largest) {
                largest = a[i];
            }

            if (a[i] < smallest) {
                smallest = a[i];
            }
        }

        int difference = largest - smallest;

        System.out.println("Largest = " + largest);
        System.out.println("Smallest = " + smallest);
        System.out.println("Difference = " + difference);

        sc.close();
    }
}