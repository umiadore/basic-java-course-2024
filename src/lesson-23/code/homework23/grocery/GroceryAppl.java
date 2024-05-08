package homework23.grocery;

import homework23.grocery.model.Buyer;
import homework23.grocery.model.Seller;

/*
Применить инкапсуляцию. Применить наследование, где уместно.
В методе main класса Main продемонстрировать как будет проходить полный процесс покупки.
 */
public class GroceryAppl {
    public static void main(String[] args) {
        Seller seller = new Seller();
        Buyer buyer = new Buyer("John", 120);
        buyer.inroduce();


        buyer.buyProduct(seller, "Lip Balm", 3 );
        buyer.buyProduct(seller, "Shampoo", 1 );

    }
}
