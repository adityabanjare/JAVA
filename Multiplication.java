import java.util.Scanner;
public class Multiplication 
{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the first no");
        int a= sc.nextInt();
        System.out.println("Enter the second no");
        int b= sc.nextInt();
        int ans=a*b;
        System.out.println("ans"+ans);
        sc.close();
    }
}