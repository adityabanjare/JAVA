import java.util.Scanner;

public class ProductOfNumbers {
    public static void productNumber(int num){
        int product = 1,digit;
        while(num!=0){
            digit = num%10;
            product=product*digit;
            num = num/10;
        }
        System.out.println("product of number = "+product);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        productNumber(num);
        sc.close();
    }
}
