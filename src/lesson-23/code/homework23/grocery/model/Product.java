package homework23.grocery.model;
/*
В классе Продукт добавить поля наименование, количество и цена.
 */
public class Product {
    private String productName;
    private int quantity;
    private double price;

    public Product() {
        this("", 0, 0);
    }
// Constructor
    public Product(String productName, int quantity, double price) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }
// Getters x setters
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = Math.max(quantity, 0);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = Math.max(price, 0);
    }
    public boolean takeAmount(int amount) {
        if (quantity < amount) {
            return false;
        }
        quantity -= amount;
        return true;
    }

}
