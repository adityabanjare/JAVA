import java.util.Scanner;
public class averageofarrayselement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0, average;
        System.out.println("enter the size of arrays element ");
        int n= sc.nextInt();
        int a[] = new int[n];
        System.out.println("enter"+n+"numbers");
        System.out.println("Display the array element:");
        for(int i=0; i<a.length; i++){
            a[i]=sc.nextInt();
        }
        for(int i =0; i<a.length; i++){
            sum = sum +a[i];
        }
         average = sum/n;
         System.out.println("the average of array element :"+average);
         sc.close();
    }
}
