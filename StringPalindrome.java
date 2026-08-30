import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String name = sc.nextLine();
        String reverse = "";
        for(int i =name.length()-1; i>=0; i--){
            reverse = reverse+name.charAt(i);
        }
        if(name.equals(reverse)){
            System.out.println("The string is palindrome:"+reverse);
        }
        else{
            System.out.println("The string is not palindrome:"+reverse);
        }
        sc.close();
        }
    }

