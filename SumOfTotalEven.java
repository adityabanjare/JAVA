import java.util.Scanner;
public class SumOfTotalEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count=0,sum=0;
        System.out.println("enter the number:");
        int num = sc.nextInt();
        while(num!=0){
            if(num%2==0){
                count++;
            }
            num =num/10;
            sum=sum+count;
        }
        System.out.println("total sum only even digit is :"+sum);
    }
}
