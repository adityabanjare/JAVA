
class Employee {
    String name;
    int id;
    double salary;
    String department;

   
    Employee() {
        this.name = "Unknown";
        this.id = 0;
        this.salary = 0.0;
        this.department = "IT";
    }

    
    Employee(String name) {
        this.name = name;
        this.id = 0;
        this.salary = 0.0;
        this.department = "IT";
    }

    
    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.department = "IT";
    }

   
    Employee(String name, int id, double salary, String department) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.department = department;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
        System.out.println("-------------------");
    }
}
    public class Employeeoverloading{
    public static void main(String[] args) {

        Employee e1 = new Employee();

        Employee e2 = new Employee("Aditya");

        Employee e3 = new Employee("Rahul", 101, 30000);

        Employee e4 = new Employee("Amit", 102, 45000, "HR");

        e1.display();
        e2.display();
        e3.display();
        e4.display();
    }
}
