import java.util.Scanner;

public class StringPractice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String name = sc.nextLine();

        System.out.println("Length: " + name.length());
        System.out.println("First Character: " + name.charAt(0));
        System.out.println("Last Character: " + name.charAt(name.length() - 1));

        String reverse = "";

        for (int i = name.length() - 1; i >= 0; i--) {
            reverse = reverse + name.charAt(i);
        }

        System.out.println("Reverse: " + reverse);

        if (name.equals(reverse)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        sc.close();
    }
}