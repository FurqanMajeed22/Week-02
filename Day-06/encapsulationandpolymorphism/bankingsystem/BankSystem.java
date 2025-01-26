package encapsulationandpolymorphism.bankingsystem;

public class BankSystem {
    public static void main(String[] args) {
        // Creating account objects
        BankAccount savingsAccount = new SavingsAccount("SA123", "Furqan", 10000);
        BankAccount currentAccount = new CurrentAccount("CA456", "Anubhav", 3000);

        // Depositing and withdrawing money from the accounts
        savingsAccount.deposit(500);
        currentAccount.withdraw(1000);

        // Demonstrating polymorphism: Calculating interest dynamically
        BankAccount[] accounts = {savingsAccount, currentAccount};
        for (BankAccount account : accounts) {
            account.displayDetails();
            System.out.println("Interest: " + account.calculateInterest());

            // Checking loan eligibility and applying for loan if eligible
            if (account instanceof Loanable) {
                Loanable loanableAccount = (Loanable) account;
                if (loanableAccount.calculateLoanEligibility()) {
                    loanableAccount.applyForLoan(2000);
                } else {
                    System.out.println(account.getHolderName() + " is not eligible for a loan.");
                }
            }
            System.out.println();
        }
    }
}
