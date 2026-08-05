import java.util.Scanner;
public class Tringale {
    public static void readData(float s1 , float s2 ,float s3){
       
       float s=(s1+s2+s3)/3;
       double Area=s*(s-s1)*(s-s2)*(s-s3);

       System.out.println("Area :"+Area);

    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the value of s1");
        float s1 = sc.nextFloat();
        System.out.println("enter the value of s2");
        float s2 = sc.nextFloat();
        System.out.println("enter the value of s3");
        float s3 = sc.nextFloat();
        readData(s1,s2,s2);
        sc.close();
    }
    
}
