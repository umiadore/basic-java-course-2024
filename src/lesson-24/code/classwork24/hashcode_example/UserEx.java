package classwork24.hashcode_example;

import java.util.Objects;

    class UserEx {
        public static void main(String[] args) {
            User user1 = new User ("Karl", 100);
            User user2 = new User ("Karl", 100);
            User user3 = new User ("Karl", 101);

            System.out.println(user1.equals(user2));
            System.out.println(user1.equals(user3));

            System.out.println("hash (" + user1 + ") = " + user1.hashCode());
            System.out.println("hash (" + user2 + ") = " + user2.hashCode());
            System.out.println("hash (" + user3 + ") = " + user3.hashCode());

        }
    }
