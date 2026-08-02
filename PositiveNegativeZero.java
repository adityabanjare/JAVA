import java.util.Scanner;

public class PositiveNegativeZero {
    public static void positiveNegativeZero(int num){
        if(num>0){
            System.out.println("positive number");
        }
        else if(num<0){
            System.out.println("negative number");
        }
        else{
            System.out.println("zero number");
        }
    }
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the num");
        int num=sc.nextInt();
        positiveNegativeZero(num);
        sc.close();
     }

}
