package classwork.computers.model;

public class Smartphone extends Laptop1 {
    private String OS; // operation system
    private boolean isSim;

    public Smartphone(String cpu, int ram, int ssd, String brand, double price, double displaySize, double weight, int batteryCapacity, String OS, boolean isSim) {
        super(cpu, ram, ssd, brand, price, displaySize, weight, batteryCapacity);
        this.OS = OS;
        this.isSim = isSim;
    }

    @Override
    public String toString() {
        return super.toString() + "Smartphone{" +
                "OS='" + OS + '\'' +
                ", isSim=" + isSim +
                '}';
    }
}
