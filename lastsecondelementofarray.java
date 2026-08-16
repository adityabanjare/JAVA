import java.util.Scanner;
public class lastsecondelementofarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array element:");
        int n = sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the " + n + "number");
        for(int i =0; i<a.length; i++){
            a[i]=sc.nextInt();
        }
        System.out.println("The second last element of array = "+a[a.length-2]);
        sc.close();
    }
}
