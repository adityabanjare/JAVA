import java.util.Scanner;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class StudentComparison {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first student name:");
        String name1 = sc.nextLine();
        System.out.println("Enter first student marks:");
        int marks1 = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter second student name:");
        String name2 = sc.nextLine();
        System.out.println("Enter second student marks:");
        int marks2 = sc.nextInt();
        Student s1 = new Student(name1, marks1);
        Student s2 = new Student(name2, marks2);
        
        if (s1.marks > s2.marks) {
            System.out.println("Higher marks: " + s1.name);
            System.out.println("Marks: " + s1.marks);
        }
        else if (s2.marks > s1.marks) {
            System.out.println("Higher marks: " + s2.name);
            System.out.println("Marks: " + s2.marks);
        }
        else {
            System.out.println("Both students have equal marks.");
        }

        sc.close();
    }
}
