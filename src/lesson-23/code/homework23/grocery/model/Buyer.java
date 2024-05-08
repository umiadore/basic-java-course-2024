package homework23.grocery.model;

/*
В классе покупателя добавить поле "количество денег" и методы:
1 "начать покупку" - принимает объект продавца, название товара и количество товара которое
нужно купить (все остальные методы можно вызвать внутри этого)
2 "отдать деньги за покупку", принимает количество денег которое нужно заплатить,
возвращает true если покупатель успешно оплатил покупку (деньги должны отниматься со счета при успешной оплате),
и false если у покупателя не хватает денег
 */
public class Buyer extends Human {
    private double money;

    // Constructor extended
    public Buyer(String name, double money) {
        super(name);
        this.money = money;
    }
    public void introduce() {
        System.out.println("Hi, my name is " + getName());
    }

    public boolean buyProduct(Seller seller, String productName, int quantity) {
        double price = seller.totalPrice(productName, quantity); // Получаем цену покупки
        if (price != -1 && pay(price)) {
            seller.sellProduct(productName, quantity);
            return true;
        } else  {
            System.out.println("You can not purchase this item: " + productName);
            return false;
        }
    }
    public boolean pay (double totalPrice)  {
        if (money >= totalPrice)  {
            money -= totalPrice;
            System.out.println("Your payment" + money + " has been done successfully!");
            return true;
        } else  {
            System.out.println("Your payment declined due the insufficient amount on your bank account");
            return false;
        }
    }
}
