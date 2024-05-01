package classwork21.example01;

public class BankAccount {
    private String fullname;
    private final String iban;
    private final AccountType accountType;
    private double amount;

    // constructor
    public BankAccount(String fullname, String iban, AccountType accountType) {
        this.fullname = fullname;
        this.iban = iban;
        this.accountType = accountType;
        amount = 0; // amount  мы задали сами
    }
// Getters x setters
    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getIban() {
        return iban;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public double getAmount() {
        return amount;
    }

    public void deposit (double amount) {
        this.amount += amount;
    }
    public void withdraw (double amount) {
        if (amount <= this.amount || accountType == AccountType.CREDIT) {
            this.amount -= amount;
        }
    }
    public boolean hasDebt () {
        return amount <0;
    }
}
