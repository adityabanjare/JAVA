import java.util.Scanner;
public class middleelementofarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int n = sc.nextInt();
        int a[]= new int[n];
        System.out.println("Enter the" +n+ "number");
        for(int i =0; i<a.length; i++){
            a[i]=sc.nextInt();
        }
        int middle = n/2;
        System.out.println("The middle element of array:"+a[middle]);
        sc.close();
    }
}
