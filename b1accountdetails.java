 import java.util.Scanner;

 class account{

  String accountholder;

  int accountnumber;

  int balance;

  String accountype;

    //constructor 1
    account(String accountholder) 

    {

        this.accountholder = accountholder;

        this.accountnumber = 0;

        this.balance =0;

        this.accountype="unkown";

        
    }

     // constuctor 2

    account(String accountholder, int accountnumber,int balance) {

        this.accountholder = accountholder;

        this.accountnumber = accountnumber;

        this.balance = balance;

    }
    // constructor 3

    account(int accountnumber) {

        this.accountholder = "unkown";

        this.accountnumber = accountnumber;

        this.balance = 0;

    }


    account(String accountholder, int acccountnumber,int balance, String accountype) {

     this.accountholder = accountholder;

     this.accountnumber = 0;

     this.balance = balance;

     this.accountype = accountype;

    }

    void display(){

        System.out.println("-------/BANK DETAILS/-------");

        System.out.println("The name of account holder is :"+accountholder);

        System.out.println("The account number is :"+accountnumber);

        System.out.println("The balance of this account holder is :"+balance);

        System.out.println("The type of this is account is :"+accountype);

    }

  
 }

 public class b1accountdetails {

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("1.enter the account holder:");

    System.out.println("2.enter the account number,balance:");

    System.out.println("3.enter the account holder,account number,balance,account type:");

    System.out.println("4.enter the full account details:");

    System.out.println("enter the choice number:");

    int choice = sc.nextInt();
    
    sc.nextLine();

    account a1;

    if(choice == 1){

        System.out.println("enter the account holder name");

        String accountholder = sc.nextLine();

        a1 = new account(accountholder);

    }
    else if(choice == 2){

        System.out.println("enter the name of account holder:");

        String accountholder = sc.nextLine();

        System.out.println("enter the account number");

        int accountnumber = sc.nextInt();

        System.out.println("enter the balance ");

        int balance = sc.nextInt();

        a1 = new account(accountholder, accountnumber,balance);

    }
    else if(choice == 3){

        System.out.println("enter the account number");

        int accountnumber = sc.nextInt();

        a1 =new account(accountnumber);

    }
    else if(choice == 4){

        
    System.out.println("Enter the name of account holder:");

    String accountholder = sc.nextLine();


    System.out.println("Enter the account number:");

    int accountnumber = sc.nextInt();


    System.out.println("Enter the balance:");

    int balance = sc.nextInt();


    sc.nextLine();


    System.out.println("Enter the account type:");

    String accountype = sc.nextLine();



    a1 = new account(accountholder, accountnumber, balance, accountype);

    }

      else {


            System.out.println("Invalid choice.");

            sc.close();

            return;

        }

   
    a1.display();

    sc.close();
    
    }

}
