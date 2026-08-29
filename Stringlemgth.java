import java.util.Scanner;

public class Stringlemgth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name:");
        String name = sc.nextLine();
        int length = name.length();
        System.out.println("The length of name is :"+length);
        sc.close();
    }
}
