import java.util.Scanner;

public class middlecharacter {
    
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the string:");

        String name = sc.nextLine();

         int a =name.length();

         int length = name.length()/2;

         char middle = name.charAt(length);

         System.out.println("The middle of word of string is:"+middle);

         System.out.println("The total words in entire program is:"+a);

         sc.close();

    }
    
}
