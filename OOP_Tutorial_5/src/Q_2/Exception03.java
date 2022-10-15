package Q_2;

import java.util.InputMismatchException;

public class Exception03 {
    static int divide(String s1[]) {
        int x, y;
        x = Integer.parseInt(s1[0]); //convert string into integer
        y = Integer.parseInt(s1[1]);
        return  x / y;
    }

    public static void main(String[] args) {

        String a[] = {"10", "0"}; //these 2 will be converted to integers

        try {
            System.out.println(a[0] + "/" + a[1] + "=" + divide(a));
        } catch (ArithmeticException e1) {
            System.out.println("Can't divide number by 0 --> " + e1);
        } catch (InputMismatchException e2) {
            System.out.println("Can't divide number by string --> " + e2);
        } catch (IndexOutOfBoundsException e3) {
            System.out.println("Accessing wrong index --> " + e3);
        }

    }

}
