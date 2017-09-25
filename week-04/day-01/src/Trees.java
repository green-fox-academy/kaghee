import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Trees {
    public static void main(String[] args) {
        ArrayList<Map<String, Object>> trees = new ArrayList<Map<String, Object>>();

        Map<String, Object> tree1 = new HashMap<String, Object>();
        tree1.put("type", "sycamore");
        tree1.put("leaves", "green");
        tree1.put("age", 25);
        tree1.put("gender", "male");
        trees.add(tree1);

        Map<String, Object> tree2 = new HashMap<String, Object>();
        tree2.put("type", "pine");
        tree2.put("leaves", "dark green");
        tree2.put("age", 9);
        tree2.put("gender", "male");
        trees.add(tree2);

        Map<String, Object> tree3 = new HashMap<String, Object>();
        tree3.put("type", "maple");
        tree3.put("leaves", "ruby");
        tree3.put("age", 64);
        tree3.put("gender", "female");
        trees.add(tree3);

        Map<String, Object> tree4 = new HashMap<String, Object>();
        tree4.put("type", "willow");
        tree4.put("leaves", "olive green");
        tree4.put("age", 109);
        tree4.put("gender", "male");
        trees.add(tree4);

        Map<String, Object> tree5 = new HashMap<String, Object>();
        tree5.put("type", "plum");
        tree5.put("leaves", "purple");
        tree5.put("age", 28);
        tree5.put("gender", "female");
        trees.add(tree5);

        System.out.println(trees);


    }
}
