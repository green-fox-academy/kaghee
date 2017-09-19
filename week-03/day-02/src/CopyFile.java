import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
    public static void main(String[] args) {
        // Write a function that copies a file to an other
        // It should take the filenames as parameters
        // It should return a boolean that shows if the copy was successful

        System.out.println(copyFile("my-file.txt", "my-file-copy.txt"));
    }

    public static boolean copyFile(String fileFrom, String fileTo) {
        List<String> contents = new ArrayList<>();
        try {
            Path fromPath = Paths.get(fileFrom);
            contents.addAll(Files.readAllLines(fromPath));
            Path toPath = Paths.get(fileTo);
            Files.write(toPath, contents);
            return true;
        } catch (IOException e) {
            return false;
        }
    }
}
