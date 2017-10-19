package generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortTheArray {

    public static <T extends Number> T[] arraySort(T[] array) {
        List<T> list = new ArrayList<>();
        Collections.sort(list);
        Collections.reverse(list);
        return list.toArray();
    }
}
