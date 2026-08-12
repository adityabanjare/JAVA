import java.util.Scanner;
public class Duplicatenumberarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count=0;
        System.out.println("enter the size of arrays:");
        int n = sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter the "+n+"numbers");
        for(int i =0; i<a.length; i++){
            a[i]=sc.nextInt();
        }
        for(int i=0; i<a.length; i++){
            for(int j=i+1; j<a.length; j++){
                if(a[i]==a[j]){
                System.out.println(a[i]);
                count++;
                }
            }
        }
                
        System.out.println("total duplicate number in array element:"+count);
                
            
        
        sc.close();
    }
}
