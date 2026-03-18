package workshop;

// Question 5: depositMoney() and withdrawMoney() methods in BankAccount

public class Q05_BankAccountMethods {
    String accountNumber;
    double balance;
    String accountHolderName;
    String accountHolderAddress;

    void depositMoney(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
            System.out.println("Current Balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    void withdrawMoney(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("Current Balance: " + balance);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public static void main(String[] args) {
        Q05_BankAccountMethods account = new Q05_BankAccountMethods();
        account.balance = 5000.00;
        account.depositMoney(1000);
        account.withdrawMoney(2000);
    }
}
