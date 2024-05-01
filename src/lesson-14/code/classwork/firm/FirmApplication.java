package classwork.firm;

import classwork.firm.model.Employee;

public class FirmApplication {
    public static void main(String[] args) {
        // создаем сотрудников
        Employee e1 = new Employee(1, "Ivan " , "Petrov", 56, true, 7000);
        Employee e2 = new Employee(2, "Sarah " , "Connor", 46, false, 4000);
        Employee e3 = new Employee(3, "Paul " , "Mueller", 56, true, 6500);

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);

        double totalSalary = e1.getSalary() + e2.getSalary() + e3.getSalary();
        System.out.println("The total salary of three is " + totalSalary + " euro.");

        e1.lunch();
        e2.work();
        e3.asleep();

        System.out.println(e1.getName());
        e1.work(); // без sout потому что он сам напечатает
    }
}
