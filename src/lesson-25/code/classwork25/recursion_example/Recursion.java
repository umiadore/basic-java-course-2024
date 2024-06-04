package classwork25.recursion_example;

public class Recursion {
        public static void main(String[] args) {
            method(500);
        }
        public static void method (int i)  {
            System.out.println(i);
            if (i ==0){
                return;
            }
            method(i-1);
        }
    }
