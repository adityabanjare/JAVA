import java.util.Scanner;

public class FindSmallestElement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array elements:");

        int a[] = new int[5];

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        int smallest = a[0];

        for (int i = 0; i < a.length; i++) {
            if (a[i] < smallest) {
                smallest = a[i];
            }
        }

        System.out.println("The smallest number in array: " + smallest);

        sc.close();
    }
}