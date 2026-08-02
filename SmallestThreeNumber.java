import java.util.Scanner;

public class SmallestThreeNumber {
    public static void smallestThreeNumber(int a, int b ,int c){
        if(a<b && a<c){
            System.out.println("Smallest = a");
        }
        else if(b<a && b<c){
            System.out.println("Smallest = b");
        }
        else{
            System.out.println("Smallest = c");
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
        smallestThreeNumber(a, b, c);
        sc.close();
    }
}
