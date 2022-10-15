package Ex1;

import java.util.Scanner;

public class Student implements IInput, IDisplay {

    private String studentID;
    private String name;

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student ID : ");
        this.studentID = sc.next();

        System.out.println("Enter Name : ");
        this.name = sc.next();
    }

    @Override
    public void print() {
        System.out.println("Student ID : " + this.studentID +
                            "\tName : " + this.name);
    }

    public void printDetails() {
        System.out.println("Student ID : " + this.studentID);
        System.out.println("Name : " + this.name);
    }

}
