import java.util.Scanner;

public class ArraySearch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter element to search:");
        int search = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < a.length; i++) {

            if (a[i] == search) {
                System.out.println("Element found at index: " + i);
                found = true;
            }
        }

        if (found == false) {
            System.out.println("Element not found");
        }

        sc.close();
    }
}
