
import java.util.Scanner;

class Employee {
    String name;
    int id;
    double salary;
    double bonus;

    // 1. Default constructor
    Employee() {
        this.name = "Unknown";
        this.id = 0;
        this.salary = 0;
        this.bonus = 0;
    }

    // 2. Constructor with name and id
    Employee(String name, int id) {
        this.name = name;
        this.id = id;
        this.salary = 0;
        this.bonus = 0;
    }

    // 3. Constructor with all values
    Employee(String name, int id, double salary, double bonus) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.bonus = bonus;
    }

    double totalSalary() {
        return salary + bonus;
    }

    void display() {
        System.out.println("\nName: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + totalSalary());
    }
}

public class EmployeeOverloading2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Default Employee");
        System.out.println("2. Name + ID");
        System.out.println("3. All Details");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        sc.nextLine();

        Employee e;

        if (choice == 1) {

            e = new Employee();

        } 
        else if (choice == 2) {

            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter ID: ");
            int id = sc.nextInt();

            e = new Employee(name, id);

        } 
        else if (choice == 3) {

            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter ID: ");
            int id = sc.nextInt();

            System.out.print("Enter salary: ");
            double salary = sc.nextDouble();

            System.out.print("Enter bonus: ");
            double bonus = sc.nextDouble();

            e = new Employee(name, id, salary, bonus);

        } 
        else {

            System.out.println("Invalid choice");
            return;
        }

        e.display();

        sc.close();
    }
}