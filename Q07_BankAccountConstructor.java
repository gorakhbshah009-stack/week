package workshop;

// Question 7: Parameterized constructor for BankAccount

public class Q07_BankAccountConstructor {
    String accountNumber;
    double balance;
    String accountHolderName;
    String accountHolderAddress;

    // Parameterized Constructor
    Q07_BankAccountConstructor(String accountNumber, double balance,
                               String accountHolderName, String accountHolderAddress) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolderName = accountHolderName;
        this.accountHolderAddress = accountHolderAddress;
    }

    public static void main(String[] args) {
        Q07_BankAccountConstructor account = new Q07_BankAccountConstructor(
            "ACC001", 5000.00, "Ram Bahadur", "Kathmandu"
        );
        System.out.println("Account Number: " + account.accountNumber);
        System.out.println("Holder: " + account.accountHolderName);
        System.out.println("Balance: " + account.balance);
    }
}
