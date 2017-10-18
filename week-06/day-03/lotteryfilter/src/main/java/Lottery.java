import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import joptsimple.OptionParser;
import joptsimple.OptionSet;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Lottery {
    public static void main(String[] args) {
        OptionParser parser = new OptionParser();
        parser.accepts("y").withRequiredArg();
        parser.accepts("f").withRequiredArg();
        parser.accepts("o").withRequiredArg();
        OptionSet options = parser.parse(args);

        CSVReader reader = null;
        List<String[]> lines = new ArrayList<>();
        CSVWriter writer = null;
        try {
            reader = new CSVReader(new FileReader("src/otos.csv"));
            lines = reader.readAll();
            writer = new CSVWriter(new FileWriter("src/output.csv"));
        } catch (IOException e) {
            System.out.println("Could not find/read/write file");
        }

        List<String[]> neededLines = new ArrayList<>();
        if (options.has("y")) {
            for (String[] line: lines) {
                System.out.println(line[0]);
                if (line[0].equals(options.valueOf("y"))) {
                    neededLines.add(line);

                }
            }
            writer.writeAll(neededLines);
            System.out.println("`-y` was given with the argument " + options.valueOf("y"));

        }

        if (options.has("f")) {
            System.out.println("`-f` was given with the argument " + options.valueOf("f"));
        }

        if (options.has("o")) {
            System.out.println("`-o` was given with the argument " + options.valueOf("o"));
        }




        writer.writeAll(lines);
        try {
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }




    }
}
