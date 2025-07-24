public class BankAccount {
    // Private fields for encapsulation
    private String accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid or insufficient funds");
        }
    }

    // Accessor method to get current balance
    public double getBalance() {
        return balance;
    }

    // Method to show account info
    public void showAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456789", 1000.00);

        account.deposit(500.00);
        account.withdraw(200.00);
        account.showAccountInfo();
    }
}