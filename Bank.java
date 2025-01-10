public class Bank {
    // Account details
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    // Array to store accounts
    private Bank[] accounts; // Array of Bank objects (acting as accounts)
    private int accountCount; // Number of accounts in the bank

    // Constructor for Bank object (as Account)
    public Bank(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    // Constructor for Bank object (as Bank to manage accounts)
    public Bank(int capacity) {
        accounts = new Bank[capacity];
        accountCount = 0;
    }

    // Add a new account
    public void addAccount(String accountNumber, String accountHolderName, double initialBalance) {
        if (accountCount < accounts.length) {
            accounts[accountCount] = new Bank(accountNumber, accountHolderName, initialBalance);
            accountCount++;
            System.out.println("Account added: " + accountNumber);
        } else {
            System.out.println("Cannot add more accounts. Bank is full!");
        }
    }

    // Remove an account by account number
    public void removeAccount(String accountNumber) {
        for (int i = 0; i < accountCount; i++) {
            if (accounts[i].accountNumber.equals(accountNumber)) {
                System.out.println("Account removed: " + accountNumber);
                // Shift accounts to fill the gap
                for (int j = i; j < accountCount - 1; j++) {
                    accounts[j] = accounts[j + 1];
                }
                accounts[accountCount - 1] = null;
                accountCount--;
                return;
            }
        }
        System.out.println("Account not found: " + accountNumber);
    }

    // Find an account by account number
    private Bank findAccount(String accountNumber) {
        for (int i = 0; i < accountCount; i++) {
            if (accounts[i].accountNumber.equals(accountNumber)) {
                return accounts[i];
            }
        }
        System.out.println("Account not found: " + accountNumber);
        return null;
    }

    // Deposit money into an account
    public void deposit(String accountNumber, double amount) {
        Bank account = findAccount(accountNumber);
        if (account != null) {
            if (amount > 0) {
                account.balance += amount;
                System.out.println("Deposited: $" + amount + " into account " + accountNumber);
            } else {
                System.out.println("Invalid deposit amount!");
            }
        }
    }

    // Withdraw money from an account
    public void withdraw(String accountNumber, double amount) {
        Bank account = findAccount(accountNumber);
        if (account != null) {
            if (amount > 0 && amount <= account.balance) {
                account.balance -= amount;
                System.out.println("Withdrawn: $" + amount + " from account " + accountNumber);
            } else {
                System.out.println("Invalid withdrawal amount or insufficient balance!");
            }
        }
    }

    // Display account details
    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber + 
                           ", Account Holder: " + accountHolderName + 
                           ", Balance: $" + balance);
    }

    // Display all accounts
    public void displayAllAccounts() {
        System.out.println("\nAll Accounts:");
        for (int i = 0; i < accountCount; i++) {
            accounts[i].displayAccountInfo();
        }
    }

    // Main method
    public static void main(String[] args) {
        // Create a bank with a capacity for 5 accounts
        Bank bank = new Bank(5);

        // Add accounts
        bank.addAccount("ACC001", "Alice", 1000);
        bank.addAccount("ACC002", "Bob", 2000);

        // Display all accounts
        bank.displayAllAccounts();

        // Perform transactions
        bank.deposit("ACC001", 500);
        bank.withdraw("ACC002", 300);

        // Display all accounts after transactions
        bank.displayAllAccounts();

        // Remove an account
        bank.removeAccount("ACC001");

        // Display all accounts after removal
        bank.displayAllAccounts();
    }
}
