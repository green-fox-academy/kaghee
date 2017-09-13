import java.util.*;

public class Matchmaking{
    public static void main(String... args){

        // Join the two lists by matching one girl with one boy in the order list
        // Exepected output: "Eve", "Joe", "Ashley", "Fred"...

        ArrayList<String> girls = new ArrayList<>(Arrays.asList("Eve","Ashley","Bözsi","Kat","Jane"));
        ArrayList<String> boys = new ArrayList<>(Arrays.asList("Joe","Fred","Béla","Todd","Neef","Jeff"));
        ArrayList<String> order = new ArrayList<>();

        for (int i = 0; i < girls.size(); i++) {
            order.add(girls.get(i));
            order.add(boys.get(i));
        }
        System.out.println(order);
    }
}