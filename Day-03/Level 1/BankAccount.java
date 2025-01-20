public class BankAccount {
    // Static variable shared across all accounts
    private static String bankName = "";
    private static int totalAccounts = 0;
    // Final variable to ensure account number cannot be changed
    private final String accountNumber;
    private String accountHolderName;
    // Constructor
    public BankAccount(String accountHolderName, String accountNumber) {
       // Using 'this' to resolve ambiguity
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++; // Increment total accounts when a new one is created
    }
    // Static method to get total number of accounts
    public static void getTotalAccounts() {
        System.out.println("Total accounts: " + totalAccounts);
    }
    // Instance method to display account details
    public void displayAccountDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
        } else {
            System.out.println("Invalid account.");
        }
    }

    // Static method to set bank name
    public static void setBankName(String name) {
        bankName = name;
    }
    public static void main(String[] args) {
        BankAccount.setBankName("jammu & kashmir Bank");
        BankAccount acc1 = new BankAccount("Furqan Majeed", "123456789");
        BankAccount acc2 = new BankAccount("Anubhav Singh", "987654321");
        acc1.displayAccountDetails();
        acc2.displayAccountDetails();
        BankAccount.getTotalAccounts();
    }
}
