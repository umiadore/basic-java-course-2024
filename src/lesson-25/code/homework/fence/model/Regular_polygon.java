package homework.fence.model;

import java.util.Scanner;

public class Regular_polygon implements Shape {
    private int numOfSide;
    private double lengthOfSide;

    public Regular_polygon(int numOfSide, double lengthOfSide) {
        this.numOfSide = numOfSide;
        this.lengthOfSide = lengthOfSide;
    }

    public double getNumOfSide() {
        return numOfSide;
    }

    public void setNumOfSide(int numOfSide) {
        this.numOfSide = numOfSide;
    }

    public double getLengthOfSide() {
        return lengthOfSide;
    }

    public void setLengthOfSide(double lengthOfSide) {
        this.lengthOfSide = lengthOfSide;
    }

    @Override
    public double getPerimeter() {
        return numOfSide * lengthOfSide;
    }
}
