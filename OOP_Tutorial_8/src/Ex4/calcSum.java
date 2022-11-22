package Ex4;

import java.util.List;

public class calcSum <T extends Number>{

    //this method will get the sum of all elements of the array
    public T sumValue(List<T> list, adder<T> adder) {
        T total = adder.zero();
        for (T n : list) {
            total = adder.add(total, n);
        }
        return total;
    }

}
