import java.util.Scanner;
public class Totalodddigit {
    public static void checkodddigit(int num){
        int digit,count=0;
        while(num!=0){
            digit=num%10;
            if(digit%2!=0){
                count++;
            }
        }
        System.out.println("Total number of odd digit in entire program :"+count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int num = sc.nextInt();
        checkodddigit(num);
        sc.close();
    }
}
