package classwork30.example01;

public class Main {
    public static void main(String[] args) {
      HelloPrinter eng = new HelloPrinter() {
          @Override
          public void printHello() {
              System.out.println("Hello");
          }
      } ;
      HelloPrinter ru = new HelloPrinter() {
          @Override
          public void printHello() {
              System.out.println("Привет");
          }
      };
      HelloPrinter ar = new HelloPrinter() {
          @Override
          public void printHello() {
              System.out.println("Mrhban");
          }
      };
      eng.printHello();
      ru.printHello();
      ar.printHello();
    }
}
