import java.util.Scanner;
public class sumofuserarray {
    public static void main(String[] args){
        int sum =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the five number of array element:");
        int a[]=new int[5];
        for(int i=0; i<a.length; i++){
            a[i]=sc.nextInt();
        
        sum = sum+a[i];
        }
        System.out.println("total sum of array element:"+sum);
    }
    
}
