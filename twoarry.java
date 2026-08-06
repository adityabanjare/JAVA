import java.util.Scanner;

public class twoarry {
    public static void main(String[] args) {
        Scanner ad=new Scanner(System.in);
        System.out.println("enter the size of array element:");
        int n = ad.nextInt();
        int a[]= new int[n];
        System.out.println("Enter " + n + " elements:");
        for(int i=0; i<a.length; i++){
            a[i]=ad.nextInt();
        
        }
        for( int i=0; i<a.length;i++){
        System.out.println(a[i]);
        }
    }
    
}
