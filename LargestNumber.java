 import java.util.Scanner;

public class LargestNumber {
 public static void largestNumber(int a, int b) 
 {
   if(a>b){
    System.out.println("largest="+a);
   }
   else{
    System.out.println("largest="+b);
   }
}
 public static void main(String[] args){
 
  Scanner sc=new Scanner(System.in);

 System.out.println("Enter the first element:");
  int a = sc.nextInt();
System.out.println("enter the second element:");
 int b = sc.nextInt();
 largestNumber(a,b);
 sc.close();

 }
}

