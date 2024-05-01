package classwork22.composition_example;

public class Order {
    private MyList orderList = new MyList();

    // Доп задание: посмотреть заказ
    // Доп задание: метод для изменения количества продукта

    // кол-во заказанных продуктов
    public int getQuantityOfProducts () {
        return orderList.getSize();
    }
    // посчитать общую сумму
    public double getTotal () {
        double total = 0;
        for (int i = 0; i < orderList.getSize(); i++) {
            total += orderList.get(i).getSubtotal();
        }
        return total;
    }
    // добавлять продукты
    public void addProduct (Product product, int quantity) {
        OrderDetails details = new OrderDetails(product, quantity);
        orderList.add(details);
    }
// убирать продукты
    public void removeProduct (int id){
        for (int i = 0; i < orderList.getSize(); i++) {
            if (orderList.get(i).getProduct().getId() == id){
                orderList.remove(i);
                break;
            }
        }
    }
}
