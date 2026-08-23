import java.util.Scanner;

class bankaccount{

    String Accountholdername;

    int accountnumber;

    int balance;

    bankaccount(String Accountholdername, int accountnumber, int balance){

        this.Accountholdername = Accountholdername;

        this.accountnumber = accountnumber;

        this.balance = balance;

    }
    void deposit(int amount){

        balance = balance+amount;

        System.out.println("The total balance in this account is :"+balance);

    }
    void withdraw(int amount){

        if(amount<=balance){

            balance = balance - amount;

            System.out.println("the total amount after withdraw is:"+balance);

        }
        else {

            System.out.println("Insufficient balance in account:");

        }
    }
    void display(){

        System.out.println("\nAccount Holder: " + Accountholdername);

        System.out.println("Account Number: " + accountnumber);

        System.out.println("Balance: " + balance);

    }
}

public class Acountdetailsbank {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name of account holder:");

        String Accountholdername=sc.nextLine();

        System.out.println("Enter the account number:");

        int accountnumber=sc.nextInt();

        System.out.println("Enter the balance of account:");

        int balance = sc.nextInt();

        bankaccount b1 =new bankaccount(Accountholdername,accountnumber,balance);

        System.out.println("Enter the deposit amount");

        int depositamount = sc.nextInt();

        b1.deposit(depositamount);

        System.out.println("Enter the withdraw amount");

        int withdrawamount = sc.nextInt();

        b1.withdraw(withdrawamount);

        b1.display();

        sc.close();
    }
}
