package Ex2;

public class Feet {

    private int feet;
    private int inches;

    public Feet(int feet, int inches) {
        this.feet = feet;
        this.inches = inches;
    }

    //add f1+f2 feet and store in current feet
    public void add(Feet f1, Feet f2) {

    }

    //display a length e.g. 5' 6"
    public void print() {
        System.out.println(this.feet + "' " + this.inches + "\"");
    }

}
