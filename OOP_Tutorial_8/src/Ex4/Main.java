package Ex4;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(8);

        calcSum<Integer> cal = new calcSum<>();
        Integer total = cal.sumValue(list, new adder<Integer>() {
            public Integer add(Integer a, Integer b) {
                return a + b;
            }
            public Integer zero() {
                return 0;
            }
        } );
        System.out.println("Total : " + total);
    }
}
