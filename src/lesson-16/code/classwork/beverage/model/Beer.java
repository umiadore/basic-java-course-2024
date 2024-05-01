package classwork.beverage.model;

public class Beer extends Beverage { // extends - расширять

    private boolean isDrafted; // разливное
    private String sort;

    public Beer(String type, boolean isHaram, String title, int quantity, String packing, boolean isDrafted, String sort) {
        super(type, isHaram, title, quantity, packing); // это поля относящиеся к родителям, то есть к тем, от кого мы extended
        this.isDrafted = isDrafted; // this это поле данного текущего объекта
        this.sort = sort;
    }

    public void toBuy (String title, String packing, int quantity) {
        super.toBuy(title, packing, quantity);
        this.sort = sort;
    }
    public  void displayStock () {
        super.displayStock();
        System.out.println("This is " + sort + "beer.");
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }
}
