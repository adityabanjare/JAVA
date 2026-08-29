import java.util.Scanner;

class stringcharAT{

       public static void main(String[] args) {

           Scanner sc = new Scanner(System.in);

           System.out.println("Enter the letters");

           String name = sc.nextLine();

           int length = name.length();

           char firstletter = name.charAt(0);

           System.out.println("the tolal number of letter in string is"+length);
           
           System.out.println("the letter of string is "+firstletter);
           
           sc.close();
       }
}