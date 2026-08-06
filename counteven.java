import java.util.Scanner;
public class counteven {
    public static void countEven(int num){
        int digit ,count=0;
        while(num!=0){
        digit = num%10;
        if(digit%2==0){
            count++;
        }
        num=num/10;
        }
        System.out.println(" total number is even:"+count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number :");
        int num = sc.nextInt();
        countEven(num);
        sc.close();

    }
}
