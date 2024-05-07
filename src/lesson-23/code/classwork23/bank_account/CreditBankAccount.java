package classwork23.bank_account;

public class CreditBankAccount extends BankAccount{
    private double creditLimit;
    private double currentDebt; // текущий долг

    public CreditBankAccount(int id, String iban, AccountHolder owner, double creditLimit) {
        super(id, iban, owner);
        this.creditLimit = creditLimit;
        currentDebt = 0;
    }

    public void takeLoan (double amount) {
        if (amount >= creditLimit - currentDebt )  {
            return;
        }
       currentDebt += amount;
        this.amount += amount;
    }
    public void repay (double amount) {
        double diff = amount - currentDebt; // если внесенные деньги превышают кредитный долг, то долг обнулется и остаток идет на дебитовый счет
        if (diff > 0)  {
            currentDebt = 0;
            this.amount += diff;
        } else  {
            currentDebt -= amount;
        }
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public double getCurrentDebt() {
        return currentDebt;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }
}
