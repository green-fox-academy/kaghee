import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Doubled {
    public static void main(String[] args) {
        // Create a method that decrypts the duplicated-chars.txt 
        decrypt("src/duplicated-chars.txt");
    }

    public static void decrypt(String filename) {
        List<String> contents = new ArrayList<>();
        String newContent = "";
        try {
            Path myPath = Paths.get(filename);
            contents.addAll(Files.readAllLines(myPath));
            for (int i = 0; i < contents.size(); i++) {
                for (int j = 0; j < contents.get(i).length(); j = j + 2) {
                    newContent += contents.get(i).valueOf(contents.get(i).charAt(j));
                }
                newContent += "\n";
            }
            System.out.println(newContent);
        } catch (IOException e) {
            //return null;
        }
    }
}
