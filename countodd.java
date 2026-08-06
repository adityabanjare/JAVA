import java.util.Scanner;
public class countodd {
    public static void counttOdd(int num){
    int digit ,count=0;
        while(num!=0){
        digit = num%10;
        if(digit%2!=0){
            count++;
        }
        num=num/10;
        }
        System.out.println(" total number is odd:"+count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number :");
        int num = sc.nextInt();
        counttOdd(num);
        sc.close();

    }
}

