package classwork23.bank_account;

public class Main {
    public static void main(String[] args) {
        AccountHolder holder = new AccountHolder("Kira", "Berlin", 28 );
        CreditBankAccount account = new CreditBankAccount(123, "AE1947474830", holder, 1000);
        account. deposit (1500) ;
        System.out.println ("Amount: " + account.getAmount());
        account. takeLoan (500);
        System.out.println("Amount: " + account. getAmount());
        System.out.println("Current debt: " + account.getCurrentDebt());
        account. takeLoan (1000);
        System.out.println("Amount:" + account.getAmount());
        System.out.println("Current debt: " + account.getCurrentDebt()) ;
    }
}
