import java.util.Scanner;
public class SmallestDigitFinder {
  public static void smallestdigit(int num){
    int digit , smallest=7;
    while(num!=0){
        digit=num%10;
        if(digit<smallest){
            smallest=digit;
        }
        num=num/10;
    }
    System.out.println("Smallest number equal = "+smallest);
  }    
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the number:");
      int num = sc.nextInt();
      smallestdigit(num);
      sc.close();
  }
}
