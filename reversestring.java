import java.util.Scanner;

public class reversestring {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string:");

        String name = sc.nextLine();

        String reverse ="";

        for( int i =name.length()-1; i>=0; i--){

          reverse = reverse+name.charAt(i);

        }

        System.out.println("In the form of reverse string is:"+reverse);
        
        sc.close();

    }
}
