/*import java.util.ArrayList;

public class bubble {
    public static void main(String[] args) {
        int[] array = {34, 12, 24, 9, 5};
        sorter(array);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    static int[] sorter(int[] list) {
        int s = 0;
        for (int i = 0; i < list.length; i++) {
            for (int j = 1; j < list.length - i; j++) {
                if (list[j - 1] > list[j]) {
                    s = list[j - 1];
                    list[j - 1] = list[j];
                    list[j] = s;
                }
            }
        }
        return list;
    }
}*/

// Same thing with arraylists instead of arrays:

import java.util.ArrayList;
import java.util.Arrays;

public class bubble {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        array.addAll(Arrays.asList(34, 12, 24, 9, 5));
        System.out.println(sorter(array));
    }

    static ArrayList sorter(ArrayList list) {
        int s = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = 1; j < list.size() - i; j++) {
                if ((int)list.get(j - 1) > (int)list.get(j)) {
                    s = (int)list.get(j - 1);
                    list.set(j - 1, (int)list.get(j));
                    list.set(j, s);
                }
            }
        }
        return list;
    }
}
