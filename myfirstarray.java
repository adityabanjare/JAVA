
import java.util.Scanner;

public class myfirstarray {
    public static void main(String[] args) {
        Scanner bem = new Scanner(System.in);
        int a[] , i;
        System.out.println("enter the array element:");
          a=new int[5];
         for( i = 0 ; i<a.length; i++){
             a[i]=bem.nextInt();
         }
         System.out.println("display array program:");
         for(i=0; i<a.length; i++){
            System.out.println(a[i]);
         }
    
    bem.close();
        }
}
