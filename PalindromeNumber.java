import java.util.Scanner;

public class PalindromeNumber {
    public static void palindromeNumber(int num){
          int rem, reverse= 0, t;
          t= num;
         while(num!=0){
            rem=num%10;
            reverse=reverse*10+rem;
            num=num/10;
         }
         if(reverse==t){
            System.out.println("number is palindrome="+reverse);
         }
         else{
            System.out.println("number is not palindrome="+reverse);
         }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        palindromeNumber(num);
        sc.close();
    }
}
