import java.util.Scanner;

public class StringFirstLast {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the your name :");

        String name = sc.nextLine();

        int length = name.length();

        char firstletter = name.charAt(0);

        char lastletter = name.charAt(name.length()-1);

        System.out.println("the tolal number of letter in string is:"+length);
           
        System.out.println("the letter of string is :"+firstletter);

        System.out.println("the last letter of string is:"+lastletter);
    }
}
