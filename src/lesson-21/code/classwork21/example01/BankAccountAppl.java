package classwork21.example01;
/*
Разработать класс для банковского аккаунта
 */
public class BankAccountAppl {
    public static void main(String[] args) {

        BankAccount account = new BankAccount("Umut Kamaeva", "AE1213141516", AccountType.CREDIT);

        account.deposit(500);
        System.out.println("Deposted 500, amount: " + account.getAmount());

        account.withdraw(400);
        System.out.println("Withdrawn 400, amount: " + account.getAmount());
        System.out.println("In debt: " + account.hasDebt());

        account.withdraw(200);
        System.out.println("Withdrawn 200, amount: " + account.getAmount());
        System.out.println("In debt: " + account.hasDebt());

        // Дополнительное задание: сделать контроллер для банковской системы
        /*
        Где можно будет хранить все аккаунты, регистрировать новые аккаунты,
        пересылать деньги с одного аккаунта на другой,
        и смотреть (выводить) все аккаунты.
         */
    }
}
