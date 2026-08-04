import java.util.Scanner;

public class VolumeOF {
    public static void voulmeOfBox(int l , int b, int h){
        System.out.println("Area="+(2*(1*b)+(b*h)+(h*1)));
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the length no:");
        int l=sc.nextInt();
        System.out.println("enter the breadth no :");
        int b = sc.nextInt();
        System.out.println("enter the heigth no:");
        int h = sc.nextInt();
        voulmeOfBox(l, b, h);
        sc.close();
    }
    
}
