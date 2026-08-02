import java.util.Scanner;
public class DivisibleBySeven {
    public static void divisibleBySeven(int number){
        if(number%7==0){
            System.out.println("number is divisible by seven");

        }
        else{
            System.out.println("number is not divisible by seven");
        }
    }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the number");
            int number= sc.nextInt();
            divisibleBySeven(number);
            sc.close();
        }

}