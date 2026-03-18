package workshop;

// Question 3 & 4: BankAccount class with attributes and object creation

public class Q03_BankAccount {
    String accountNumber;
    double balance;
    String accountHolderName;
    String accountHolderAddress;

    public static void main(String[] args) {
        Q03_BankAccount account = new Q03_BankAccount();
        account.accountNumber = "ACC001";
        account.balance = 5000.00;
        account.accountHolderName = "Ram Bahadur";
        account.accountHolderAddress = "Kathmandu, Nepal";

        System.out.println("Account Number: " + account.accountNumber);
        System.out.println("Holder Name: " + account.accountHolderName);
        System.out.println("Address: " + account.accountHolderAddress);
        System.out.println("Balance: " + account.balance);
    }
}
