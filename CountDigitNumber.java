import java.util.Scanner;
public class CountDigitNumber  
{
    public static void countNumber(int num){
        int count=0;
        while(num!=0){
        num=num / 10;
        count++;
        }
        System.out.println("count number is equal to:"+count);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the Number:");
        int num=sc.nextInt();
        countNumber(num);
        sc.close();
    }
    
}
