import java.util.Scanner;
public class StudentMarks
{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the physics marks");
    float sub1=sc.nextFloat();
    System.out.println("enter the chemistry marks");
    float sub2=sc.nextFloat();
    System.out.println("enter the maths marks");
    float sub3=sc.nextFloat();
    float total = sub1+sub2+sub3;
    float average = total/3;
    System.out.println("Total = " + total);
    System.out.println("average ="+average);
    sc.close();
    }
}