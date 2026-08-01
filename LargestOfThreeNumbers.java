import java.util.Scanner;

public class LargestOfThreeNumbers {
    public static void largestOfThreeNumber(int a, int b , int c){
        if(a>b && a>c){
            System.out.println("largest = a");
        }
        else if(b>a && b>c){
            System.out.println("largest = b");
        }
        else{
            System.out.println("largest = c");
        }
    }    
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first element");
        int a = sc.nextInt();
        System.out.println("enter the second element");
        int b = sc.nextInt();
        System.out.println("enter the third element");
        int c = sc.nextInt();
        largestOfThreeNumber(a, b, c);
        sc.close();
    }
}
