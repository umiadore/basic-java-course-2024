package classwork23.bank_account;

public class BankAccount {
    protected int id;
    protected String iban;
    protected AccountHolder owner;
    protected double amount;

    // Constructor, without "amount", amount we are writing ourselves as 0
    public BankAccount(int id, String iban, AccountHolder owner) {
        this.id = id;
        this.iban = iban;
        this.owner = owner;
        amount = 0;
    }

    public void withdraw (double amount){
        if (this.amount >= amount) {
            this.amount -= amount;
        }
    }

    public void deposit (double amount){
        this.amount +=amount;
    }

    public int getId() {
        return id;
    }

    public String getIban() {
        return iban;
    }

    public AccountHolder getOwner() {
        return owner;
    }

    public double getAmount() {
        return amount;
    }

    public void setOwner(AccountHolder owner) {
        this.owner = owner;
    }
}
