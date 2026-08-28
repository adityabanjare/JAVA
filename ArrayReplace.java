import java.util.Scanner;

public class ArrayReplace {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter element to replace:");
        int oldElement = sc.nextInt();

        System.out.println("Enter new element:");
        int newElement = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < a.length; i++) {

            if (a[i] == oldElement) {
                a[i] = newElement;
                found = true;
            }
        }

        if (found) {
            System.out.println("Updated array:");

            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i] + " ");
            }
        } 
        else {
            System.out.println("Element not found");
        }

        sc.close();
    }
}
