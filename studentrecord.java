import java.util.Scanner;
class student1{
    String name;
    int age;
    int roll ;
    float percentage;
    void display1(){
        System.out.println("The name of student is :"+name);
        System.out.println("The age of student is :"+age); 
        System.out.println("The roll no of student is :"+roll );
        System.out.println("The percentage of student is :"+percentage);
    }
}
class student2{
    String name;
    int age;
    int roll;
    float percentage;
    void  display2(){
        System.out.println("The name of student is :"+name);
        System.out.println("The age of student is :"+age); 
        System.out.println("The roll no of student is :"+roll );
        System.out.println("The percentage of student is :"+percentage);

    }
}
public class studentrecord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        student1 s1=new student1();
        student2 s2 = new student2();
        System.out.println("Enter the name of student1:");
        s1.name=sc.nextLine();
        System.out.println("Enter the age of student1:");
        s1.age=sc.nextInt();
        System.out.println("Enter the roll number of student1:");
        s1.roll=sc.nextInt();
        System.out.println("Enter the percentage of student1");
        s1.percentage=sc.nextFloat();
        sc.nextLine();
        System.out.println("Enter the name of student2:");
        s2.name=sc.nextLine();
        System.out.println("Enter the age of student2:");
        s2.age=sc.nextInt();
        System.out.println("Enter the roll number of student2:");
        s2.roll=sc.nextInt();
        System.out.println("Enter the percentage of student2");
        s2.percentage=sc.nextFloat();
        System.out.println("first student details");
        s1.display1();
        System.out.println("===============================================");
        System.out.println("The second studenet details");
        s2.display2();
        System.out.println("===============================================");
        sc.close();


    }
}
