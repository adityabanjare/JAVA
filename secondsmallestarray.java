import java.util.Scanner;
public class secondsmallestarray {
      public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the size of array element:");
        int n = sc.nextInt();
        int a[]= new int[n];
        System.out.println("enter the"+n+"numbers");
        for(int i=0; i<a.length; i++){
          a[i]=sc.nextInt();
        }
        int smallest = a[0];
        int secondsmallest=a[0];
        for(int i =0; i<a.length; i++){
            if(a[i]<smallest){
                secondsmallest=smallest;
                smallest= a[i];
            }
            else if(a[i]<secondsmallest){
                secondsmallest=a[i];
            }
        }
     System.out.println("The smallest number in arrray:"+smallest);
     System.out.println("The second smallest number in arrray:"+secondsmallest);
     sc.close();
    }
}

