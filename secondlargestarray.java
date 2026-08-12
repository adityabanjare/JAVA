import java.util.Scanner;
public class secondlargestarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the size of array element:");
        int n = sc.nextInt();
        int a[]= new int[n];
        System.out.println("enter the"+n+"numbers");
        for(int i=0; i<a.length; i++){
          a[i]=sc.nextInt();
        }
        int largest = a[0];
        int secondlargest=a[0];
        for(int i =0; i<a.length; i++){
            if(a[i]>largest){
                secondlargest=largest;
                largest = a[i];
            }
            else if(a[i]>secondlargest){
                secondlargest=a[i];
            }
        }
     System.out.println("The largest number in arrray:"+largest);
     System.out.println("The second largest number in arrray:"+secondlargest);
     sc.close();
    }
}
