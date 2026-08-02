import java.util.Scanner;

public class DivisibleByFiveAndEleven {
    public static void divisibleBy(int num){
        if(num % 5 ==0 && num % 11==0){
            System.out.println("Number is divisible by both 5 and 11");
        }
        else{
            System.out.println(".Number is not divisible by both 5 and 11");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        divisibleBy(num);
        sc.close();
    }
}
