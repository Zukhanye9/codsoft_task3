public class BankAccount {
    private double balance;

    //Constructor
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    //Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: R" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    
    //Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrew: R" + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance for withdrawal.");
        }else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    //Method to check balance
    public double checkBalance() {
        return balance;
    }
}