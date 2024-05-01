 class TernaryOperatorExample {
    public static void main(String[] args) {
        String x;

        if (2 > 1) {
            x = "sign1";
        } else {
            x = "sign2";
        }
        System.out.println(x);
}
}

 class TernaryOperator {
     public static void main(String[] args) {
         String x;

         if (2 > 1) {
             x = "sign1";
         } else {
             x = "sign2";
         }

         // то же самое что блоки if - else выше:
         x = 2 >  1 ? "sign1" : "sign2";

         System.out.println(x);
     }
 }

 class TernaryOperator2 {
     public static void main(String[] args) {
         System.out.println(
                 (9*37) > 200? "sign1" : "sign2"
         );
     }
 }

