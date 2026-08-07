import java.util.Scanner;

public class Totalevendigit {
    public static void numberofevendigit(int num){
        int digit,count =0;
        while(num!=0){
            digit = num%10;
            if(digit%2==0){
                count++;
            }
            num = num/10;
        }
        System.out.println("total number of even digit in entire number:"+count);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the numebr :");
        int num = sc.nextInt();
        numberofevendigit(num);
        sc.close();
    }
}
