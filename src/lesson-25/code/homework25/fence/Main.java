package homework25.fence;

import homework25.fence.Circle;
import homework25.fence.Rectangle;
import homework25.fence.RegularPolygon;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What shape of the fence do you want to build? Please select:");
        System.out.println("1:Polygon");
        System.out.println("2: Circle");
        System.out.println("3: Rectangle");
        int shape = scanner.nextInt();

        double perimeter = 0;

        switch (shape) {
            case 1: System.out.println("Input number of sides");
            int numOfSide = scanner.nextInt();
            System.out.println("Input the length of your plot side ");
            double lengthOfSide = scanner.nextDouble();
            RegularPolygon polygon = new RegularPolygon(numOfSide,lengthOfSide);
                perimeter = polygon.getPerimeter();
                System.out.println("Perimeter of the polygon: " + perimeter);
                break;

            case 2: System.out.println("Input radius of your plot side");
            double r = scanner.nextDouble();
            Circle circle  = new Circle(r);
                perimeter = circle.getPerimeter();
                System.out.println("Perimeter of the circle: " + perimeter);
                break;

            case 3:System.out.println("Input length of your plot side");
            double a = scanner.nextDouble();
                System.out.println("Input width of your plot side");
                double b = scanner.nextDouble();
                Rectangle rectangle = new Rectangle(a,b);
                perimeter = rectangle.getPerimeter();
                System.out.println("Perimeter of the rectangle: " + perimeter);
                break;
            default:
                System.out.println("Incorrect Input. Try again");
                return;
        }
        System.out.print("Input the price per meter: ");
        double pricePerMeter = scanner.nextDouble();
        double totalPrice = perimeter * pricePerMeter;
        System.out.println("Total price for the fence: " + totalPrice);
    }
}