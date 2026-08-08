import java.util.Scanner;

public class SizeOfArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n, a[];
        System.out.println("enter the size of arrray element:");
         n = sc.nextInt();
          a=new int[n];
         System.out.println("enter"+n+"number");
         for(int i =0; i<a.length; i++){
            a[i]=sc.nextInt();
         }
         System.out.println("dispaly array element:");
         for(int i=0; i<a.length; i++){
            System.out.println(a[i]);
         }
         sc.close();
    }
    
}
