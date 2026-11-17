class BankAccount {
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount deposited: Rs. " + amount);
        } else {
            System.out.println("Please enter a valid deposit amount.");
        }
    }

    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Please enter a valid withdrawal amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance. Withdrawal not possible.");
        } else {
            balance -= amount;
            System.out.println("Amount withdrawn: Rs. " + amount);
        }
    }

    void checkBalance() {
        System.out.println("Current balance: Rs. " + balance);
    }

    void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: Rs. " + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(1001, "Rahul Sharma", 5000.0);
        BankAccount account2 = new BankAccount(1002, "Priya Verma", 8000.0);

        System.out.println("----- Account 1 -----");
        account1.deposit(2000.0);
        account1.withdraw(1500.0);
        account1.checkBalance();

        System.out.println();

        System.out.println("----- Account 2 -----");
        account2.deposit(1000.0);
        account2.withdraw(12000.0);
        account2.withdraw(2000.0);
        account2.checkBalance();

        System.out.println();

        System.out.println("----- Final Account Details -----");
        System.out.println("Account 1:");
        account1.displayDetails();

        System.out.println();

        System.out.println("Account 2:");
        account2.displayDetails();
    }
}
