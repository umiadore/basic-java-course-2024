package classwork.computers.model;

import java.util.Objects;

public class Computer1 {
    private String cpu; // процессор / central processing unit
    private int ram; // random access memory
    private int ssd; // жестский диск или размер памяти
    private String brand;
    private  double price;

    public Computer1(String cpu, int ram, int ssd, String brand, double price) {
        this.cpu = cpu;
        this.ram = ram;
        this.ssd = ssd;
        this.brand = brand;
        this.price = price;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getSsd() {
        return ssd;
    }

    public void setSsd(int ssd) {
        this.ssd = ssd;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram=" + ram +
                ", ssd=" + ssd +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
            if (!(obj instanceof Computer1)) { // !-отрицание
                return false;
            }
            Computer1 other = (Computer1) obj;
            return brand == other.getBrand() && cpu == other.getCpu() && ram == other.getRam() && ssd == other.getSsd();
    }




    @Override
    public int hashCode() {
        return Objects.hash(cpu, ram, ssd, brand, price);
    }
}
