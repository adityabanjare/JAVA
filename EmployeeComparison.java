import java.util.Scanner;
class Employee {

    String name;
    String department;
    int salary;

    Employee(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}
public class EmployeeComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first employee name:");
        String name1 = sc.nextLine();
        System.out.println("Enter first employee department:");
        String department1 = sc.nextLine();
        System.out.println("Enter first employee salary:");
        int salary1 = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter second employee name:");
        String name2 = sc.nextLine();
        System.out.println("Enter second employee department:");
        String department2 = sc.nextLine();
        System.out.println("Enter second employee salary:");
        int salary2 = sc.nextInt();
        Employee e1 = new Employee(name1, department1, salary1);
        Employee e2 = new Employee(name2, department2, salary2);
        if (e1.salary > e2.salary) {

            System.out.println("\nEmployee with higher salary:");
            System.out.println("Name: " + e1.name);
            System.out.println("Department: " + e1.department);
            System.out.println("Salary: " + e1.salary);

        } else if (e2.salary > e1.salary) {

            System.out.println("\nEmployee with higher salary:");
            System.out.println("Name: " + e2.name);
            System.out.println("Department: " + e2.department);
            System.out.println("Salary: " + e2.salary);

        } else {

            System.out.println("Both employees have same salary.");
        }

        sc.close();
    }
}
