import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class EncodedLines {

    public static void main(String[] args) {
        // Create a method that decrypts encoded-lines.txt
        
        decryptFile("src/encoded-lines.txt");
    }

    public static void decryptFile(String filename) {
        List<String> contents = new ArrayList<>();
        String newContent = "";
        try {
            Path myPath = Paths.get(filename);
            contents.addAll(Files.readAllLines(myPath));
            for (int i = 0; i < contents.size(); i++) {
                for (int j = 0; j < contents.get(i).length(); j++) {
                    if (contents.get(i).charAt(j) != ' ') {
                        newContent += toPrevChar(contents.get(i).charAt(j));
                    } else {
                        newContent += " ";
                    }
                }
                newContent += "\n";
            }
            System.out.println(newContent);
        } catch (IOException e) {
            // no error msg
        }
    }

    public static char toPrevChar(char character) {         // converts a character to its ASCII value then returns the next ASCII char
        return (char)(int)(character - 1);
    }
}
