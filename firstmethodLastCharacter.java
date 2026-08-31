import java.util.Scanner;

public class firstmethodLastCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String name = sc.nextLine();
        int length = name.length();
        char lastcharacter=name.charAt(name.length()-1);
        System.out.println("The last letter is:"+lastcharacter);
        System.out.println(length);
        sc.close();
    }
}
