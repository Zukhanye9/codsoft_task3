public class Main {
    public static void main(String[] args) {
        //Create a new bank account with an initial balance
        BankAccount account = new BankAccount(1000.00);

        //Create a ATM with the bank account
        ATM atm = new ATM(account);

        atm.execute();
    }
}
