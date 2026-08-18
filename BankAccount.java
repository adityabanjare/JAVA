import java.util.Scanner;

class accountholder1{
    String name;
    int age;
    int Accoutno;
    void display(){
        System.out.println("===============================");
        System.out.println("The name of account holder is:"+name);
        System.out.println("The age of account holder is:"+age);
        System.out.println("The account number of holder is:"+Accoutno);
        System.out.println("===============================");
    }
}
class accountholder2{
    String name;
    int age;
    int Accoutno;
    void display(){
        System.out.println("The name of account holder is:"+name);
        System.out.println("The age of account holder is:"+age);
        System.out.println("The account number of holder is:"+Accoutno);
        System.out.println("===============================");
    }
}
public class BankAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        accountholder1 ac1=new accountholder1();
        accountholder2 ac2 = new accountholder2();
        System.out.println("Enter the first name of Account Holder:");
        ac1.name = sc.nextLine();
        System.out.println("Enter the age of Account Holder:");
        ac1.age = sc.nextInt();
        System.out.println("Enter the Account number of Holder");
        ac1.Accoutno=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the first name of Account Holder:");
        ac2.name = sc.nextLine();
        System.out.println("Enter the age of Account Holder:");
        ac2.age = sc.nextInt();
        System.out.println("Enter the Account number of Holder");
        ac2.Accoutno=sc.nextInt();
        ac1.display();
        ac2.display();
        sc.close();
    }
}
