import java.util.Scanner;
class student{
    String name;
    int age;

void display(){
    System.out.println("The name of student is :"+name);
    System.out.println("The age of student is :"+age);
}
}
public class myfirstobject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        student s1=new student();
        System.out.println("Enter the name of student:");
        s1.name = sc.nextLine();
        System.out.println("Enter the age of student:");
        s1.age=sc.nextInt();
        s1.display();
        sc.close();
        }
}
