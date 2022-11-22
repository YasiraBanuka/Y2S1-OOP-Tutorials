package Ex1;

import java.util.ArrayList;

public class Demo {

    public static void main(String[] args) {

        ArrayList<Employee> arrList = new ArrayList<>();

        double salary = 0;

        for (int i = 0; i < 5; i++) {

            Employee e = new Employee();
            e.getDetails();

            salary = salary + e.getSalary();

            arrList.add(e);

        }

        for (Employee emp : arrList) {

            emp.printDetails();
            System.out.println("------------------");

        }

        System.out.println("Total salary of Employees : " + salary);

        arrList.removeAll(arrList);

        System.out.println(arrList);

    }

}
