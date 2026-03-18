package workshop;

// Question 13: BankAccount with multiple constructor overloads

public class Q13_BankAccountOverloaded {
    private String accountNumber;
    private double balance;
    private String accountHolderName;
    private String accountHolderAddress;

    // Constructor 1: No-argument
    Q13_BankAccountOverloaded() {
        accountNumber = "N/A";
        balance = 0.0;
        accountHolderName = "Unknown";
        accountHolderAddress = "Unknown";
        System.out.println("Default BankAccount created.");
    }

    // Constructor 2: Account number + holder name
    Q13_BankAccountOverloaded(String accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = 0.0;
        this.accountHolderAddress = "Not Provided";
    }

    // Constructor 3: Account number + balance + holder name
    Q13_BankAccountOverloaded(String accountNumber, double balance, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolderName = accountHolderName;
        this.accountHolderAddress = "Not Provided";
    }

    // Constructor 4: Full parameterized
    Q13_BankAccountOverloaded(String accountNumber, double balance,
                              String accountHolderName, String accountHolderAddress) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolderName = accountHolderName;
        this.accountHolderAddress = accountHolderAddress;
    }

    public double getBalance()           { return balance; }
    public String getAccountNumber()     { return accountNumber; }
    public String getAccountHolderName() { return accountHolderName; }

    public static void main(String[] args) {
        Q13_BankAccountOverloaded acc1 = new Q13_BankAccountOverloaded();
        Q13_BankAccountOverloaded acc2 = new Q13_BankAccountOverloaded("ACC002", "Sita Kumari");
        Q13_BankAccountOverloaded acc3 = new Q13_BankAccountOverloaded("ACC003", 3000.00, "Hari Prasad");
        Q13_BankAccountOverloaded acc4 = new Q13_BankAccountOverloaded("ACC004", 7000.00, "Gita Devi", "Pokhara");

        System.out.println(acc1.getAccountHolderName() + " - Balance: " + acc1.getBalance());
        System.out.println(acc2.getAccountHolderName() + " - Balance: " + acc2.getBalance());
        System.out.println(acc3.getAccountHolderName() + " - Balance: " + acc3.getBalance());
        System.out.println(acc4.getAccountHolderName() + " - Balance: " + acc4.getBalance());
    }
}
