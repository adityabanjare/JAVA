import java.util.Scanner;
public class Calculator{
    public static void add(int a , int b){
        System.out.println("addition:"+(a+b));
    }
    public static  void subract(int a , int b){
        System.out.println("subraction:"+(a-b));
    }
    public static  void multiple(int a, int b){
        System.out.println("multiplication:"+(a*b));
    }
    public static  void divide(int a , int b){
        if (b!=0){
        System.out.println("division:"+(a/b));
        }
        else{
            System.out.println("division by is not allowe");
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first num");
        int a = sc.nextInt();
        System.out.println("enter the second num");
        int b = sc.nextInt();
        add(a,b);
        subract(a,b);
        multiple(a,b);
        divide(a,b);
    }
} 