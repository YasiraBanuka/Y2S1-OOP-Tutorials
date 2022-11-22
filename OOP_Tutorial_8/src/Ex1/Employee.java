package Ex1;

public class Employee {

    private int id;
    private String name;
    private double bsalary;
    private double additions;
    private double deductions;
    private double totalSalary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBsalary() {
        return bsalary;
    }

    public void setBsalary(double bsalary) {
        this.bsalary = bsalary;
    }

    public double getAdditions() {
        return additions;
    }

    public void setAdditions(double additions) {
        this.additions = additions;
    }

    public double getDeductions() {
        return deductions;
    }

    public void setDeductions(double deductions) {
        this.deductions = deductions;
    }

    public double calculateTotalSalary() {
        totalSalary = bsalary + additions - deductions;
        return totalSalary;
    }
}
