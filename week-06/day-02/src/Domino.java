import java.util.Arrays;

public class Domino implements Comparable<Domino> {
    private final int[] values;

    public Domino(int valueA, int valueB) {
        this.values = new int[]{valueA, valueB};
    }

    public int[] getValues() {
        return values;
    }

    @Override
    public String toString() {
        return "[" + values[0] + ", " + values[1] + "]";
    }

    @Override
    public int compareTo(Domino d) {
        int compareValue = (int)(d.values[0]);
        int compareValue2 = (int)(d.values[1]);
        if (this.values[0] - compareValue != 0) {
            return this.values[0] - compareValue;
        } else {
            return this.values[1] - compareValue2;
        }
    }
}