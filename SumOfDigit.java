import java.util.Scanner;
public class SumOfDigit {
    public static void sumOfDigit(int num){
        int sum =0, digit ;
        while(num!=0){
            digit=num%10;
            sum=sum+digit;  
            num = num/10;


    }
    System.out.println("sum of all digit ="+sum);
}
    public static void main(String[] args) {
        Scanner na = new Scanner(System.in);
        System.out.println("enter the number :");
        int num = na.nextInt();
        sumOfDigit(num);
        na.close();
    }
    
}
