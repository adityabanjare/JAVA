import java.util.Scanner;
public class CountDivisibleBy3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array element:");
        int n = sc.nextInt();
        int a[]= new int[n];
        System.out.println("Enter the" +n+ "number");
        for(int i = 0; i<a.length; i++){
            a[i]= sc.nextInt();
        }
        int divisiblebythreecount = 0;
        int notdivisiblebythreecount = 0;
        for(int i = 0; i<a.length; i++){
            if(a[i]%3==0){
                divisiblebythreecount++;
            }
            else{
                notdivisiblebythreecount++;
            }
        }
        System.out.println("The array of some element divisible by three"+divisiblebythreecount);
        System.out.println("The array of some element not divisible by three"+notdivisiblebythreecount);
        sc.close();
    }
}
