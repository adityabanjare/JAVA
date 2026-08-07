import java.util.Scanner;
public class productoffirstlast {
    public static void firstlastdigit(int num){
        int digit , lastnumber,firstnumber,product=1;
        digit=num%10;
        lastnumber=digit;
        while(num>=10){
            num = num/10;
        }
        firstnumber=num;
        product = product*firstnumber*lastnumber;
        System.out.println("product of first and last:"+product);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int num = sc.nextInt();
        firstlastdigit(num);
        sc.close();
    }
}
