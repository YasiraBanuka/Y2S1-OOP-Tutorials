package Tutorial_2.Ex_2;
import java.lang.Math;

public class Point3D {
    private int x, y, z;

    public Point3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double distance() {
        double res1 = (x * x) + (y * y) + (z * z);
        double res2 = Math.sqrt(res1); // sqrt is declared in Math class. And it's a static method. So call it through class name -- Math.sqrt()
        return res2;
    }
}
