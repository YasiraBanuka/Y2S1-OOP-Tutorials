package Ex1;

import java.util.Scanner;

public class Employee {

    //declare variables
    private String name;
    private String id;
    private String department;
    private double salary;

    //get details from the keyboard
    public void getDetails() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Employee Name : ");
        name = sc.next();

        System.out.println("Enter Employee ID : ");
        id = sc.next();

        System.out.println("Enter Employee Department : ");
        department = sc.next();

        System.out.println("Enter Employee Salary : ");
        salary = sc.nextDouble();

    }

    public void printDetails() {

        System.out.println("Employee Name : " + name);
        System.out.println("Employee ID : " + id);
        System.out.println("Employee Department : " + department);
        System.out.println("Employee Salary : " + salary);

    }

    public double getSalary() {

        return salary;
        
    }

}
