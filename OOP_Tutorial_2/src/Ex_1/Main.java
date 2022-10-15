package Ex_1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student("IT2134", "Nirmal");

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Ex_1.Student mark 1 : ");
        double m1 = scan.nextDouble();
        s1.setMark1(m1);
        System.out.print("Enter Ex_1.Student mark 2 : ");
        double m2 = scan.nextDouble();
        s1.setMark1(m2);
        System.out.print("Enter Ex_1.Student mark 3 : ");
        double m3 = scan.nextDouble();
        s1.setMark1(m3);

        s1.calcAvg();

        s1.display();

    }

}
