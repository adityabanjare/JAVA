import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the five arrays element:");
        int a[]=new int[5];
        for(int i=0; i<a.length; i++){
            a[i]=sc.nextInt();
        }
        System.out.println("enter the search element:");
        int n= sc.nextInt();
        int AV;
        AV=-1;
        for(int i=0; i<a.length; i++){
            if(a[i]==n){
                AV=i;
                break;
            }
        }
        if(AV!=-1){
        System.out.println("element found at index of:"+AV);
        }
        else{
            System.out.println("element are not found at index of :");
        }
        sc.close();
    }
}
