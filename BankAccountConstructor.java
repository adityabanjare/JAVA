class BankAccount {
    String name;
    int accountNumber;
    double balance;

    BankAccount(String name, int accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
}

public class BankAccountConstructor {
    public static void main(String[] args) {

        BankAccount b1 =
            new BankAccount("Adarsh", 12345, 25000);

        System.out.println("Name: " + b1.name);
        System.out.println("Account Number: " + b1.accountNumber);
        System.out.println("Balance: " + b1.balance);
    }
}
