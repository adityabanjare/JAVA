import java.util.Scanner;
public class NaturalNumberSum{
 
    public static void sumOfFirstNNumbers(int num){
        int sum = 0 ;
        for(int i=1;i<=num; i++){
            sum=sum+i;
        }
        System.out.println("sum of N natural number="+sum);
    }

public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int num;
    System.out.println("enter the number:");
    num=sc.nextInt();
    sumOfFirstNNumbers(num);
    sc.close();
}
    
}


