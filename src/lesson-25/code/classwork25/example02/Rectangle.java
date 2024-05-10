package classwork25.example02;
// прямоугольник
public class Rectangle implements Shape{

    private double l;
    private double h;

    public Rectangle(double l, double h) {
        this.l = l;
        this.h = h;
    }

    public double getL() {
        return l;
    }

    public void setL(double l) {
        this.l = l;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    @Override
    public double getSquare() {
        return l*h;
    }
}
