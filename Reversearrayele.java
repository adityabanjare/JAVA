import java.util.Scanner;
public class Reversearrayele {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the five element in array");
        int a[]=new int[5];
        for(int i=0; i<a.length; i++){
            a[i]=sc.nextInt();
        }
        int reverse;
        for(int i = a.length-1; i>=0; i--){
            reverse = a[i];
        
        System.out.println("The reverse array element:"+reverse);
        }
        sc.close();
    }
}
