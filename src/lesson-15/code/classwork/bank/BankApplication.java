package classwork.bank;

import classwork.bank.model.BankAccount;

public class BankApplication {
    public static void main(String[] args) {

        BankAccount acc0 = new BankAccount(1000, "Peter", "Erste", 101, 100);
        System.out.println(acc0.getBalance());
        System.out.println(acc0.getOwner());
        acc0.display();

        acc0.deposit(500);
        System.out.println(acc0.getBalance());
        acc0.display();

        BankAccount acc1 = new BankAccount(2000, "Kira", "Erste", 101);
        acc1.display();

        BankAccount acc2 = new BankAccount(3000, "Erste", 101);
        acc2.deposit(1000000);
        acc2.display();

        acc2.display("Salam Aleykum, Mr. ");
        acc2.setOwner("Pablo");
        acc2.display(" Mr");

    } // end of main
} // end of class
