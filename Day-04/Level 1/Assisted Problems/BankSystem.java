import java.util.ArrayList;
import java.util.List;

// Bank class
class Bank {
    private String name;
    private List<Customer> customers;

    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public void openAccount(Customer customer, String accountType, double initialDeposit) {
        Account newAccount = new Account(this, accountType, initialDeposit);
        customer.addAccount(newAccount);
        if (!customers.contains(customer)) {
            customers.add(customer);
        }
        System.out.println("Account opened for " + customer.getName() + " with balance: " + initialDeposit);
    }

    public String getName() {
        return name;
    }

    public List<Customer> getCustomers() {
        return customers;
    }
}

// Customer class
class Customer {
    private String name;
    private List<Account> accounts;

    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void viewBalance() {
        for (Account account : accounts) {
            System.out.println("Account Type: " + account.getAccountType() +
                    ", Balance: " + account.getBalance() +
                    ", Bank: " + account.getBank().getName());
        }
    }

    public String getName() {
        return name;
    }
}

// Account class
class Account {
    private Bank bank;
    private String accountType;
    private double balance;

    public Account(Bank bank, String accountType, double balance) {
        this.bank = bank;
        this.accountType = accountType;
        this.balance = balance;
    }

    public Bank getBank() {
        return bank;
    }

    public String getAccountType() {
        return accountType;
    }

    public double getBalance() {
        return balance;
    }
}

// Main class to test the association
public class BankSystem {
    public static void main(String[] args) {
        Bank bank = new Bank("State Bank of India");

        Customer customer1 = new Customer("Furqan Majeed");
        Customer customer2 = new Customer("Anubhav Singh");

        bank.openAccount(customer1, "Savings", 500.0);
        bank.openAccount(customer1, "Checking", 1000.0);
        bank.openAccount(customer2, "Savings", 200.0);

        System.out.println("\nCustomer Balances:");
        customer1.viewBalance();
        customer2.viewBalance();
    }
}
