import java.util.Scanner;
public class FindLargestElement {
    public static void main(String[] args) {
        int Largest =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the five array element:");
        int a[]= new int[5];
        for(int i =0; i<a.length; i++){
            a[i]=sc.nextInt();
        }
        Largest=a[0];
        for(int i = 0 ; i<a.length; i++){
        if(a[i]>Largest){
            Largest=a[i];

        }
        }
        System.out.println("The largest element in array :"+Largest);
        sc.close();
    }
}
