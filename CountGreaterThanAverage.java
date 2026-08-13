import java.util.Scanner;

public class CountGreaterThanAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int average;
        int sum =0;
        System.out.println("enter the size of array:");
        int n = sc.nextInt();
        int a[]= new int[n];
        System.out.println("ente the"+n+"numbers");
        for(int i =0; i<a.length; i++){
            a[i]=sc.nextInt();
        }
        
        System.out.println("enter the greater than number");
        int GTHan=sc.nextInt();
        for(int i =0; i<a.length; i++){
            sum = sum+a[i];
        }
        average = sum/2;
        if(average>GTHan){
            System.out.println("The enter number is small than average"+average);
        }
        else{
            System.out.println("the enter number is greater than average"+average);
        }
        sc.close();
    }
}
