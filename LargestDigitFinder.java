import java.util.Scanner;
public class LargestDigitFinder {
    public static void largestdigit(int num){
        int digit, largest = 0 ,larg;
        while(num!=0) {
            digit= num%10;
        if(digit>largest){
            largest=digit;
        
        }
        num=num/10;

    }
    System.out.println("largest Number digit equal to :"+largest);
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int num = sc.nextInt();
        largestdigit(num);
        sc.close();
    
    }

    
}
