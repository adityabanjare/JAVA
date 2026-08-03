import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num ,i;
        int prime=0;
        System.out.println("Enter the num");
        num=sc.nextInt();
            for(i=2;i<num; i++){
                if(num%i==0){
                    prime = 1;
                    break;

                }
            }
    if(prime==0){
        System.out.println("num is prime number");
    }
    else{
        System.out.println("num is not prime number");
    }
        
    }
    
}
