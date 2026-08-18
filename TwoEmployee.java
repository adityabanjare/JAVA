import java.util.Scanner;
class employee1{
         String name;
         int age;
         int salary;
}
class employee2{
    String name;
    int age;
    int salary;
}
public class TwoEmployee{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        employee1 cr = new employee1();
        employee2 cr2 = new employee2();
        System.out.println("Enter the name of employee 1:");
        cr.name = sc.nextLine();
        System.out.println("Enter the age of employee 1:");
        cr.age= sc.nextInt();
        System.out.println("Enter the salary of employee 1:");
        cr.salary=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the name of employee 2:");
        cr2.name = sc.nextLine();
        System.out.println("Enter the age of employee 2:");
        cr2.age= sc.nextInt();
        System.out.println("Enter the salary of employee 2:");
        cr2.salary=sc.nextInt();
        System.out.println("==============================");
        System.out.println("The name of employee 1 :"+cr.name);
        System.out.println("The age of employee 1:"+cr.age);
        System.out.println("The salary of employee 1:"+cr.salary);
        System.out.println("==============================");
        System.out.println("The name of employee 2 :"+cr2.name);
        System.out.println("The age of employee 2:"+cr2.age);
        System.out.println("The salary of employee 2:"+cr2.salary);
        sc.close();
}
}