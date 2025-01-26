package encapsulationandpolymorphism.bankingsystem;


// SavingsAccount class extending BankAccount and implementing Loanable
class SavingsAccount extends BankAccount implements Loanable {
    private static final double INTEREST_RATE = 0.05;  // 5% interest for savings accounts

    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * INTEREST_RATE;  // Interest for savings account
    }

    @Override
    public void applyForLoan(double loanAmount) {
        if (loanAmount <= getBalance() * 5) {
            System.out.println("Loan of " + loanAmount + " approved for " + getHolderName());
        } else {
            System.out.println("Loan application rejected for " + getHolderName());
        }
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() > 5000;  // Eligible for loan if balance is more than $5000
    }
}



