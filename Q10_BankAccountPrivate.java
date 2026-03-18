package workshop;

// Question 10: Private balance attribute with public getter method

public class Q10_BankAccountPrivate {
    String accountNumber;
    private double balance;    // private attribute
    String accountHolderName;
    String accountHolderAddress;

    Q10_BankAccountPrivate(String accountNumber, double balance,
                           String accountHolderName, String accountHolderAddress) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolderName = accountHolderName;
        this.accountHolderAddress = accountHolderAddress;
    }

    // Public getter for balance
    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        Q10_BankAccountPrivate account = new Q10_BankAccountPrivate(
            "ACC001", 5000.00, "Ram Bahadur", "Kathmandu"
        );
        System.out.println("Balance: " + account.getBalance());
    }
}
