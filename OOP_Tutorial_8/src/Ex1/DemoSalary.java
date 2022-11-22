package Ex1;

import java.util.Scanner;

public class DemoSalary {

    public static void main(String[] args) {

        String id;
        String name;
        String bSalary;
        String additions;
        String deductions;
        double totalSalary;

        Employee emp = new Employee();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID : ");
        id = sc.next();
        emp.setId(Integer.parseInt(id)); //convert string into int

        System.out.print("Enter Employee Name : ");
        name = sc.next();
        emp.setName(name);

        System.out.print("Enter Employee Basic Salary : ");
        bSalary = sc.next();
        emp.setBsalary(Double.parseDouble(bSalary));

        System.out.print("Enter Additions : ");
        additions = sc.next();
        emp.setAdditions(Double.parseDouble(additions));

        System.out.print("Enter Deductions : ");
        deductions = sc.next();
        emp.setDeductions(Double.parseDouble(deductions));

        totalSalary = emp.calculateTotalSalary();

        System.out.println("-----Salary Details-----");
        System.out.println("Employee ID : " + emp.getId());
        System.out.println("Employee Name : " + emp.getName());
        System.out.println("Total Salary : " + totalSalary);

    }

}
