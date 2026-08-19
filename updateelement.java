import java.util.Scanner;
public class updateelement {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter " +n+ "number");
        for(int i=0; i<a.length; i++){
            a[i]=sc.nextInt();
        }
        for(int i=0; i<a.length; i++){
        System.out.println("displya"+a[i]);
        }
        System.out.println("Enter the update element:");
        int b = sc.nextInt();
         a[2]=b;
         for(int i =0; i<a.length; i++){
        System.out.println("Update element of arrya is:"+a[i]);
         }
         sc.close();
    }
}
