import java.util.Scanner;
class student{
    String name;
    String course;
    int rollno;

    student(String name){
        this.name= name;
        this.course="unkown";
        this.rollno=0;
    }

    student(String name,String course,int rollno) {
        this.name = name;
        this.course = course;
        this.rollno=rollno;

    }

    student() {
        this.name = "unkown";
        this.course = "unkown";
        this.rollno = 0;
    }
    
    
}
public class ScStudentOverloading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.enter the  name ");
        System.out.println("2.enter the name, course ");
        System.out.println("3.ente the name, course, rollno");
        System.out.println("4.no information about student:");
        System.out.println("Enter the choice number");
        int choice = sc.nextInt();
        sc.nextLine();
        student s1;
        if(choice == 1){
         System.out.println("Enter the name of student");
         String name = sc.nextLine();
          s1 = new student(name);
        }  
        else if(choice == 2 ){
            System.out.println("Enter the name of student");
            String name = sc.nextLine();
            System.out.println("enter the course name:");
            String course = sc.nextLine();
            System.out.println("Enter the roll number of student:");
            int rollno = sc.nextInt();
            s1 = new student(name , course , rollno);
        }  

        else if (choice == 3) 
        {
             System.out.println("Enter the name of student");
            String name = sc.nextLine();
            System.out.println("enter the course name:");
            String course = sc.nextLine();
            System.out.println("Enter the roll number of student:");
            int rollno = 0;
            s1= new student(name , course , 0);
        }
        else {
            s1 = new student();
        }
        System.out.println("\n----- Student Details -----");
        System.out.println("Name: "+s1.name);
        System.out.println("Course: "+s1.course);
        System.out.println("Roll Number: "+s1.rollno);
        sc.close();
    }
}
