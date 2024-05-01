package classwork.beverage.model;

public class Beverage {

    private String type;
    private boolean isHaram;
    private String title;
    private int quantity;
    private String packing;

    //all arguments constructor
    public Beverage(String type, boolean isHaram, String title, int quantity, String packing) {
        this.type = type;
        this.isHaram = isHaram;
        this.title = title;
        this.quantity = quantity;
        this.packing = packing;
    }

    // нулевой контруктоp - no arguments constructor
    public Beverage() {
    }
    // getters x setters
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isHaram() {
        return isHaram;
    }

    public void setHaram(boolean haram) {
        isHaram = haram;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getPacking() {
        return packing;
    }

    public void setPacking(String packing) {
        this.packing = packing;
    }

    // method for buying

    public void toBuy (String title, String packing, int quantity) {
        System.out.println("Go to the market and get: " + title + " , " + packing + " , " + quantity + ".");
    }

    // what is left warehouse (in stock)
    public void displayStock () {
        System.out.println("What is left: " + title + " , " + packing + " , " + quantity + ".");
    }
}
