class BankAccount {
    private final String accountHolder;
    private final String accountNumber;
    private double balance;
    public BankAccount(String accountHolder, String accountNumber, double openingBalance) {
        if (accountHolder == null || accountHolder.isBlank()) {
            throw new IllegalArgumentException("Account holder name is required.");
        }
        if (accountNumber == null || accountNumber.isBlank()) {
            throw new IllegalArgumentException("Account number is required.");
        }
        if (openingBalance < 0) {
            throw new IllegalArgumentException("Opening balance cannot be negative.");
        }
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = openingBalance;
    }
    public String getAccountHolder()  { return accountHolder; }
    public String getAccountNumber()  { return accountNumber; }
    public double getBalance()        { return balance; }
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.printf("REJECTED: Deposit must be positive (attempted %.2f).%n", amount);
            return;
        }
        balance += amount;
        System.out.printf("Deposited %.2f. New balance: %.2f%n", amount, balance);
    }
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.printf("REJECTED: Withdrawal must be positive (attempted %.2f).%n", amount);
            return;
        }
        if (amount > balance) {
            System.out.printf("REJECTED: Insufficient funds. Balance: %.2f, requested: %.2f%n",
                              balance, amount);
            return;
        }
        balance -= amount;
        System.out.printf("Withdrew %.2f. New balance: %.2f%n", amount, balance);
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount acct = new BankAccount("Naveen ", "SB-1001", 5000.00);

        System.out.println("Account : " + acct.getAccountHolder() + " (" + acct.getAccountNumber() + ")");
        System.out.printf("Starting balance: %.2f%n%n", acct.getBalance());
        System.out.println("    Valid transactions    ");
        acct.deposit(1500.00);
        acct.withdraw(2000.00);
        System.out.println("\n    Invalid transactions    ");
        acct.deposit(-300.00);
        acct.deposit(0);
        acct.withdraw(-500.00);
        acct.withdraw(0);
        acct.withdraw(999999.00);
        System.out.printf("%nFinal balance: %.2f (protected from all invalid attempts)%n", acct.getBalance());
    }
}
