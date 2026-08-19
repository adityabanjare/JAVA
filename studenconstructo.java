import java.util.Scanner;
 class studentview{
    String name;
    int age;
    int rollno;

    public studentview(String name, int age, int rollno) {
        this.name = name;
        this.age = age;
        this.rollno=rollno;
    }
    void display() {
        System.out.println("The name of student is :"+name);
        System.out.println("The age of student is:"+age);
        System.out.println("The roll number of student:"+rollno);
    }
    
 }
public class studenconstructo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of student:");
        String name = sc.nextLine();
        System.out.println("enter the age of student:");
        int age = sc.nextInt();
        System.out.println("enter the roll no:");
        int rollno =sc.nextInt();
        studentview s1 = new studentview(name, age, rollno);
        s1.display();
    }
}
