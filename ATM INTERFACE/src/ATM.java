import java.util.Scanner;


public class ATM {
    private BankAccount account;
    private Scanner scanner;


    //Constructor
    public ATM(BankAccount account) {
        this.account = account;
        this.scanner = new Scanner(System.in);

    }

    //Display welcome message
    private void displayWelcomeMessage() {
        System.out.println("Welcome to the ATM Interface!");
        System.out.println("Please choose one of the following options:");
    }

    //Display menu options
    public void displayMenu() {
        System.out.println("\nATM Menu:");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
    }

    //Execute user commands
    public void execute() {
        displayWelcomeMessage();
        
        boolean running = true;
        while (running) {
            displayMenu();
            System.out.println("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                     handleDeposit();
                     break;

                case 2:
                     handleWithdraw();
                     break;

                case 3:
                    handleCheckBalance();
                     break;

                case 4:
                     running = false;
                     System.out.println("Thank you for using the ATM. Goodbye!");
                     break;
                default:
                     System.out.println("Invalid choice. Please try again.");

            }
        }
    }

    //Handle deposit operation
    private void handleDeposit() {
        System.out.print("Enter deposit amount: ");
        double amount = scanner.nextDouble();
        account.deposit(amount);
    }

    //Handle withdrawal operation
    private void handleWithdraw() {
        System.out.print("Enter withdrawal amount: ");
        double amount = scanner.nextDouble();
        account.withdraw(amount);
    }

    //Handle check balance operation
    private void handleCheckBalance() {
        double balance = account.checkBalance();
        System.out.println("Your current balance is: R" + balance);
    }
}
