import java.util.Scanner;
public class FrequencyOfElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count=0;
        System.out.println("enter the size  of array element:");
        int n = sc.nextInt();
        int a[]= new int[n];
        System.out.println("enter the"+n+"numbers");
        for(int i =0; i<a.length; i++){
            a[i]=sc.nextInt();
        }
        System.out.println("enter the search element:");
        int b = sc.nextInt();
        for(int i = 0; i<a.length; i++){
            if(a[i]==b){
                count++;
            }
        }
        System.out.println("the frequency of element in array program:"+count);
        sc.close();
    }
}
