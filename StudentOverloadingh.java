import java.util.Scanner;

class Student {
    String name;
    int rollNo;
    String course;
    double marks;

    // 1. Default constructor
    Student() {
        this.name = "Unknown";
        this.rollNo = 0;
        this.course = "Unknown";
        this.marks = 0.0;
    }

    // 2. Constructor with name
    Student(String name) {
        this.name = name;
        this.rollNo = 0;
        this.course = "Unknown";
        this.marks = 0.0;
    }

    // 3. Constructor with name and rollNo
    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
        this.course = "Unknown";
        this.marks = 0.0;
    }

    // 4. Constructor with all details
    Student(String name, int rollNo, String course, double marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.course = course;
        this.marks = marks;
    }

    void display() {
        System.out.println("\nName: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Course: " + course);
        System.out.println("Marks: " + marks);
    }
}

public class StudentOverloadingh {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Default Student");
        System.out.println("2. Name Only");
        System.out.println("3. Name + Roll No");
        System.out.println("4. All Details");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        sc.nextLine();

        Student s;

        if (choice == 1) {

            s = new Student();

        } 
        else if (choice == 2) {

            System.out.print("Enter name: ");
            String name = sc.nextLine();

            s = new Student(name);

        } 
        else if (choice == 3) {

            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter roll number: ");
            int rollNo = sc.nextInt();

            s = new Student(name, rollNo);

        } 
        else if (choice == 4) {

            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter roll number: ");
            int rollNo = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter course: ");
            String course = sc.nextLine();

            System.out.print("Enter marks: ");
            double marks = sc.nextDouble();

            s = new Student(name, rollNo, course, marks);

        } 
        else {

            System.out.println("Invalid choice");
            return;
        }

        s.display();

        sc.close();
    }
}