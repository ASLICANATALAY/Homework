public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Alice", 500.0);
        System.out.println(acc1.getInfo());

        acc1.deposit(250.0);      // balance: 750.0
        acc1.withdraw(100.0);     // balance: 650.0
        System.out.println("acc1 balance after operations: " + acc1.getBalance());

        BankAccount acc2 = new BankAccount("Bob", 1000.0);
        acc2.withdraw(2500.0);    // should fail because of MAX_WITHDRAW_LIMIT
        System.out.println("Total accounts: " + BankAccount.getTotalAccounts());
    }
}
