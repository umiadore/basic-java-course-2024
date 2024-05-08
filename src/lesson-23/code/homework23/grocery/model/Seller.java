package homework23.grocery.model;

import homework23.grocery.model.Product;

/*
В классе продавца создать массив из Продуктов с размером 10.
Заполнить этот массив значениями из головы в конструкторе продавца либо в Main.
Разработать методы:
1 "огласить цену" - принимает наименование продукта и его количество, и возвращает цену
этого продукта
или -1 если такого продукта нет либо нет соответствующего количества на складе
Подсказка: линейный поиск
2 "продать продукт" - принимает наименование продукта и количество, отнимает данный
продукт со склада (из массива)

 */
public class Seller{

    public static Product[] products = new Product[10];

    static {
        products [0] = new Product("Shampoo",12, 5.2);
        products [1] = new Product("Shower Gel",8, 3.2);
        products [2] = new Product("Soap",100, 1);
        products [3] = new Product("Perfume",20, 45);
        products [4] = new Product("Nail Polish",10, 2);
        products [5] = new Product("Lip Balm",50, 3.8);
        products [6] = new Product("Eyeliner",22, 22);
        products [7] = new Product("Moisturizer",55, 32);
        products [8] = new Product("Tonic",65, 27);
        products [9] = new Product("Makeup Remover",72, 15);
    }
// нулевой конструктор
    public Seller () {
    }

    public static double totalPrice (String productName, int quantity)  {
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            if (product.getProductName().equals(productName) && product.getQuantity() >= quantity) {
                return product.getPrice() * quantity;
            }
       }
       return -1; //  -1 если такого продукта нет либо нет соответствующего количества на складе
    }

    public static void sellProduct (String productName, int quantity){
        for (int i = 0; i < products.length; i++) {
            Product product = products [i];
            if (product.getProductName().equals(productName) && product.getQuantity()>= quantity){
                product.setQuantity(product.getQuantity() -quantity);
                System.out.println("Sold: " + quantity +  " of " + productName);
                return;
        }
        }
        System.out.println(productName + " is sold out!" );
    }
}
