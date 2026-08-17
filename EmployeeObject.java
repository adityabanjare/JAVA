import java.util.Scanner;
class employee{
    String name;
    int age ;
    String department;
    int salary;
    void display(){
        System.out.println("The name of employee is :"+name);
        System.out.println("The age of employee is :"+age);
        System.out.println("The name of department employee that belong:"+department);
        System.out.println("The salary of employee is "+salary);
    }
}
public class EmployeeObject {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        employee em = new employee();
        System.out.println("Enter the name of employee:");
        em.name =sc.nextLine();
        System.out.println("Enter the age of employee:");
        em.age=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the name of department name:");
        em.department=sc.nextLine();
        System.out.println("Enter the salary of employee");
        em.salary = sc.nextInt();
        em.display();
        sc.close();

    }
}
