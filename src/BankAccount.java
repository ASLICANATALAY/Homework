public class BankAccount {
    private final int accountNumber;              // random, cannot change
    private String ownerName;
    private double balance;
    private static int totalAccounts = 0;         // shared by all objects
    private static final double MIN_BALANCE = 0.0;
    private static final double MAX_WITHDRAW_LIMIT = 2000.0;

    public BankAccount(String ownerName, double initialDeposit) {
        this.ownerName = ownerName;
        if (initialDeposit < MIN_BALANCE) {
            this.balance = MIN_BALANCE;
        } else {
            this.balance = initialDeposit;
        }
        this.accountNumber = 100000 + (int) (Math.random() * 900000);
        totalAccounts++;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdraw amount must be positive.");
            return;
        }

        if (amount > MAX_WITHDRAW_LIMIT) {
            System.out.println("Withdraw failed: exceeds max withdraw limit ("
                    + MAX_WITHDRAW_LIMIT + ").");
            return;
        }

        if (balance - amount < MIN_BALANCE) {
            System.out.println("Withdraw failed: not enough balance.");
            return;
        }

        balance -= amount;
    }

    public String getInfo() {
        return "Account Number: " + accountNumber
                + "  Owner: " + ownerName
                + "  Balance: " + balance
                + "  Total Accounts: " + totalAccounts;
    }
}
