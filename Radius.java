import java.util.Scanner;
public class Radius
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first value");
        float r1=sc.nextFloat();
        System.out.println("enter the second value");
        float r2=sc.nextFloat();
        float area= 3.14f*(r1*r2);
        System.out.println(area);
        sc.close();
    }

}