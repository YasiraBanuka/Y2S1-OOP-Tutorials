package Ex2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Ex2 {
    public static void main(String[] args) {

        ArrayList<Integer> xArr = new ArrayList<>();
        xArr.add(2);
        xArr.add(3);

        ArrayList<String> yArr = new ArrayList<>();
        yArr.add("AA");
        yArr.add("BB");

        List temp = new ArrayList();

        Swap<ArrayList<Integer>, ArrayList<String>> swap = new Swap();
        HashMap<String, List> hashMap = swap.swap(xArr, yArr, temp);

        System.out.println(hashMap.get("X"));
        System.out.println(hashMap.get("Y"));

    }
}
