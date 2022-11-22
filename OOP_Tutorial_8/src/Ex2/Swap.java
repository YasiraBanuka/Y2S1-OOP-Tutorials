package Ex2;

import java.util.HashMap;
import java.util.List;

public class Swap<T extends List, V extends List> {

    public HashMap<String, List> swap (T xArr, V yArr, List tempArr) {

        HashMap<String, List> hashMap = new HashMap<>();

        for (int i = 0; i < xArr.size(); i++) {
            tempArr.add(xArr.get(i));
            xArr.remove(i);
            i--;
        }

        for (int i = 0; i < yArr.size(); i++) {
            xArr.add(yArr.remove(i));
            i--;
        }

        for (int i = 0; i < tempArr.size(); i++) {
            yArr.add(tempArr.get(i));
        }

        hashMap.put("X", xArr);
        hashMap.put("Y", yArr);

        return hashMap;

    }

}
