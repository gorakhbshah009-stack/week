package workshop;

// Question 12: Customer class combining encapsulation, constructors, and BankAccount

class BankAccountInfo {
    private String accountNumber;
    private double balance;

    public BankAccountInfo(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() { return accountNumber; }
    public double getBalance()       { return balance; }
}

public class Q12_Customer {
    private int customerId;
    private String name;
    private BankAccountInfo bankAccount;

    // Parameterized Constructor
    public Q12_Customer(int customerId, String name, BankAccountInfo bankAccount) {
        this.customerId = customerId;
        this.name = name;
        this.bankAccount = bankAccount;
    }

    // Getters
    public int getCustomerId()              { return customerId; }
    public String getName()                 { return name; }
    public BankAccountInfo getBankAccount() { return bankAccount; }

    // Setter
    public void setName(String name) { this.name = name; }

    public static void main(String[] args) {
        Q12_Customer c1 = new Q12_Customer(1, "Ram Bahadur",
                            new BankAccountInfo("ACC001", 5000.00));
        Q12_Customer c2 = new Q12_Customer(2, "Sita Kumari",
                            new BankAccountInfo("ACC002", 8000.00));

        System.out.println("Customer 1: " + c1.getName()
                         + ", Balance: " + c1.getBankAccount().getBalance());
        System.out.println("Customer 2: " + c2.getName()
                         + ", Balance: " + c2.getBankAccount().getBalance());

        // Demonstrating setter
        c1.setName("Ram B. Thapa");
        System.out.println("Updated Name: " + c1.getName());
    }
}
