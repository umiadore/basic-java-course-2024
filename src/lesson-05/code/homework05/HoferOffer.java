package homework05;
/*
Задача 2. Сделайте расчет покупки товаров со скидками.
Товар А стоит X евро и на него скидка D%,
а товар B стоит Y евро и на него скидка С%.
Клиент взял N товаров A и M товаров B.
Если сумма покупки превысила 100 евро,
то полагается дополнительная скидка 5%.
Вычислите итоговую стоимость покупки и величину полученной скидки.
 */
public class HoferOffer {
    public static void main(String[] args) {
        int A = 12; // Price of product A before discount
        int B = 21; // Price of product B before discount
        int D = 5; // Discount percentage for product A
        int C = 10; // Discount percentage for product B
        int N = 4; // Quantity of product A
        int M = 3; // Quantity of product B

        double discounted_price_A = A - (A * D / 100.0);
        double discounted_price_B = B - (B * C / 100.0);

        double total_cost_before_discount = (N * discounted_price_A) + (M * discounted_price_B);
        if (total_cost_before_discount > 100) {
            double final_price = total_cost_before_discount - (total_cost_before_discount * 5 / 100.0);
            double discount_received = total_cost_before_discount - final_price;
            System.out.println("Final Price after additional 5% discount: " + final_price + " euros");
            System.out.println("Discount received: " + discount_received + " euros");
        } else {
            System.out.println("Total Cost: " + total_cost_before_discount + " euros");
            System.out.println("No additional discount applied.");
        }
    } // end of main
} // end of class
