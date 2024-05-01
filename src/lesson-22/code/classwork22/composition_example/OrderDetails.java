package classwork22.composition_example;

public class OrderDetails {
    private Product product;
    private int quantity;
    private double subtotal;
    // constructor
    public OrderDetails(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
        subtotal = product.getPrice() * quantity; // расчитываем сами
    }
// getters
    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getSubtotal() {
        return subtotal;
    }
// setters
    public void setProduct(Product product) {
        this.product = product;
        subtotal = product.getPrice() * quantity; // добавили из конструктора
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
        subtotal = product.getPrice() * quantity; // добавили из конструктора
    }
}
