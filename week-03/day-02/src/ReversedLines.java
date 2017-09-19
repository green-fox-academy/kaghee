import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedLines {

    public static void main(String[] args) {
        // Create a method that decrypts reversed-lines.txt
        reverser("src/reversed-lines.txt");
    }

    public static void reverser(String filename) {
        List<String> contents = new ArrayList<>();
        String newContent = "";
        try {
            Path myPath = Paths.get(filename);
            contents.addAll(Files.readAllLines(myPath));
            for (int i = 0; i < contents.size(); i++) {
                for (int j = contents.get(i).length() - 1; j >= 0; j--) {
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
