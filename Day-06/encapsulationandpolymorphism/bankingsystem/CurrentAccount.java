package encapsulationandpolymorphism.bankingsystem;

// CurrentAccount class extending BankAccount and implementing Loanable
class CurrentAccount extends BankAccount implements Loanable {
    private static final double INTEREST_RATE = 0.02;  // 2% interest for current accounts

    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * INTEREST_RATE;  // Interest for current account
    }

    @Override
    public void applyForLoan(double loanAmount) {
        if (loanAmount <= getBalance() * 3) {
            System.out.println("Loan of " + loanAmount + " approved for " + getHolderName());
        } else {
            System.out.println("Loan application rejected for " + getHolderName());
        }
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() > 2000;  // Eligible for loan if balance is more than $2000
    }
}
