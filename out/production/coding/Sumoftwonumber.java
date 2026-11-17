import java.util.Scanner;
 public class Sumoftwonumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = sc.nextInt();
        System.out.println("Enter the second name:");
        int b =sc.nextInt();
        int sum;
        sum = a+b;
        System.out.println("the of two number is "+sum);
        sc.close();
    }
 }