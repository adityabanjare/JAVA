import java.util.Scanner;
public class countgreaterthan50 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int count=0;
    System.out.println("enter the size of array element:");
    int n = sc.nextInt();
    int a[]=new int[n];
    System.out.println("enter the"+n+"numbers");
    for(int i= 0; i<a.length; i++){
        a[i]=sc.nextInt();
    }
    for(int i =0; i<a.length; i++){
        if(a[i]>50){
            count++;
        }
    }
    System.out.println("The total number are greater than fifty is :"+count);
    sc.close();
    }
}
