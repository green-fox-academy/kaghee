import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedOrder {
    public static void main(String[] args) {
        // Create a method that decrypts reversed-order.txt
        lineReverser("src/reversed-order.txt");
    }

    public static void lineReverser(String filename) {
        List<String> contents = new ArrayList<>();
        String newContent = "";
        try {
            Path myPath = Paths.get(filename);
            contents.addAll(Files.readAllLines(myPath));
            for (int i = contents.size() - 1; i >= 0; i--) {
                for (int j = 0; j < contents.get(i).length(); j++) {
                    newContent += contents.get(i).valueOf(contents.get(i).charAt(j));
                }
                newContent += "\n";
            }
            System.out.println(newContent);
        } catch (IOException e) {
            // no error msg
        }
    }
}
