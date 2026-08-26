import java.util.Scanner;
class employee{
    String name;
    int age;
    int salary;
    employee(String name){
        this.name = name;
        this.age = 0;
        this.salary = 0;

    }
    employee(String name, int age){
        this.name = name;
        this.age = age;
        this.salary = 0;

    }
    employee(String name, int age, int salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    employee(){
        this.name = "unkown";
        this.age = 0;
        this.salary = 0;
    }
    
    void display(){
        System.out.println("the name of employee is:"+name);
        System.out.println("the age of employee is:"+age);
        System.out.println("the salary of employee is:"+salary);
    }
}
 public class EmployeeConstructorOverloading{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("1.enter the employee name: ");
        System.out.println("2.enter the employee name , age");
        System.out.println("3.enter the employee name , age , salary");
        System.out.println("enter the choice number");
        int choice = sc.nextInt();
        sc.nextLine();
        employee e1;
        if(choice == 1){
        System.out.println(" enter the name of employee:");
        String name = sc.nextLine();
        e1 =new employee(name);
        }
        else if(choice == 2){
            System.out.println("enter the name of employee");
            String name = sc.nextLine();
            System.out.println("enter the age of employee");
            int age =  sc.nextInt();
            e1 = new employee(name,age);
        }
        else if(choice == 3){
             System.out.println("enter the name of employee");
            String name = sc.nextLine();
            System.out.println("enter the age of employee");
            int age =  sc.nextInt();
            System.out.println("enter the salary of employee");
            int salary = sc.nextInt();
            e1 = new employee(name,age, salary);
        }
        else{
            e1 = new employee();
        }
      e1.display();
      sc.close();
    }
}
