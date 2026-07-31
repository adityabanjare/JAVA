import java.util.Scanner;
public class LengthBreadth
{
public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the first value");
    int a = sc.nextInt();
    System.out.println("enter the second value");
    int b = sc.nextInt();
    int Area = a*b;
    System.out.println ("Area"+Area);
    sc.close();
}



}