import java.util.Scanner;

public class secondmethodlength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String name = sc.nextLine();
        System.out.println("the character is :"+name.length());
        sc.close();
    }
}
