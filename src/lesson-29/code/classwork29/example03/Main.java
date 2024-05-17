package classwork29.example03;

public class Main {
    public static void main(String[] args) {
        MyArrayList29 <String> list = new MyArrayList29<>();
        list.add("Hello");
        list.add("world");
        list.add("java");

        for (int i = 0; i < list.getSize(); i++) {
            String elem = list.get(i);
            System.out.println(elem);
        }
        for (String s:list) {
            System.out.println(s);
        }

        MyArrayList29 <Integer> list1 = new MyArrayList29<>();
        list1.add(5); // таким образом создаются объекты типа интеджер, через конструктор его создавать нельзя только через valueof
        list1.add( Integer.parseInt("123")); // parse достает из строки число
        list1.add( Integer.valueOf(24556)); // parse достает из строки число

        for (int i:list1) {
            System.out.println(i);
        }
    }
}
