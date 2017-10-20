package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortTheArray {
    static Integer[] list = {1, 3, 7, 22, 45, 2};

    public <T extends Number> void arraySort(T[] array) {
        try {
            Arrays.sort(list, Collections.reverseOrder());
            for (int i = 0; i < list.length; i++) {
                System.out.print(list[i] + " ");
            }
        } catch (Exception e) {
            System.out.println("Sorry, I ran into an error.");
        }
    }

    public static void main(String[] args) {
        SortTheArray example = new SortTheArray();
        example.arraySort(list);
    }
}
