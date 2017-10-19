package splitstring;

public class SplitString {
    String[] result = new String[2];

    public String toString() {
        return result[0] + " " + result[1];
    }

    public String[] split(String string, int num) {
        result[0] = string.substring(0, num);
        result[1] = string.substring(num);
        return result;
    }

    public static void main(String[] args) {
        SplitString ss = new SplitString();

        try {
            ss.split("lovebarbara", 4);
            System.out.println(ss);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Sorry, index out of bounds.");
        } catch (Exception e) {
            System.out.println("Sorry, something went wrong.");
        }
    }
}
