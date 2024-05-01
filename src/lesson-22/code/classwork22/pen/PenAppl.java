package classwork22.pen;

public class PenAppl {
    public static void main(String[] args) {
        Pen pen = new Pen();
        for (int i = 0; i < 20; i++) { // 20 - just an example
            pen.write("Hello world!!!");
            pen.checkInk();
            if (pen.getInkAmount() <=0) {
                pen.refill();
                System.out.println("(refilled the pen)");
            }
        }
    }
}
