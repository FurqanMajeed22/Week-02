class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;
    public BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Amount to deposit must be positive.");
        }
    }
    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrew:" + amount);
            } else {
                System.out.println("Insufficient balance for withdrawal.");
            }
        } else {
            System.out.println("Amount to withdraw must be positive.");
        }
    }
    // Method to display the current balance
    public void displayBalance() {
        System.out.println("Current balance:" + balance);
    }

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount("Furqan Majeed", "123456", 5000.0);
         // Display initial balance
        account1.displayBalance();
          // Deposit money into the account
        account1.deposit(200.0);
                  // Withdraw money from the account
        account1.withdraw(100.0);
           // Display the updated balance
        account1.displayBalance();
        // Try withdrawing more than the available balance
        account1.withdraw(20000);
    }
}
