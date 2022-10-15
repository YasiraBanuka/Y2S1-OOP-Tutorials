package Ex_1;

public class Student {
    String ID;
    String name;
    double mark1;
    double mark2;
    double mark3;
    double avgMark;

    public Student(String ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    public Student(double mark1, double mark2, double mark3) {
        this.mark1 = 0.0;
        this.mark2 = 0.0;
        this.mark3 = 0.0;
    }

    public double getMark1() {
        return mark1;
    }

    public void setMark1(double mark1) {
        this.mark1 = mark1;
    }

    public double getMark2() {
        return mark2;
    }

    public void setMark2(double mark2) {
        this.mark2 = mark2;
    }

    public double getMark3() {
        return mark3;
    }

    public void setMark3(double mark3) {
        this.mark3 = mark3;
    }

    public double calcAvg() {
        avgMark = (mark1 + mark2 + mark3) / 3;
        return avgMark;
    }

    public void display() {
        System.out.println("Ex_1.Student ID : " + this.ID);
        System.out.println("Ex_1.Student name : " + this.name);
        System.out.println("Average mark : " + this.avgMark);
    }
}

