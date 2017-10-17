import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TodoApp {
    List<Task> tasks;
    Path myPath;

    public TodoApp() {
        this.myPath = Paths.get("tasks.txt");
        this.tasks = new ArrayList<>();

        try {
            Scanner fileReader = new Scanner(myPath);
            while (fileReader.hasNext()) {
                String[] line = fileReader.nextLine().split("¢¢");
                Task temp = new Task(line[0]);
                tasks.add(temp);
            }
        } catch (IOException e) {
            System.out.println("Could not read file");
        }
    }

    public void manual() {
        System.out.println("\nCommand Line Todo application\n" +
                "=============================\n" +
                "\n" +
                "Command line arguments:\n" +
                " -l   Lists all the tasks\n" +
                " -a   Adds a new task\n" +
                " -r   Removes a task\n" +
                " -c   Completes a task");
    }

    public void listTasks() {
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).isComplete) {
                System.out.println((i + 1) + " - [X] " + tasks.get(i).name);
            } else {
                System.out.println((i + 1) + " - [ ] " + tasks.get(i).name);
            }
        }
    }

    public void addTask(String task) {
        Task newTask = new Task(task);
        tasks.add(newTask);
        save();
    }

    public void removeTask(String number) {
        if (tasks.size() < 2) {
            System.out.println("No can do. You have less than 2 tasks.");
        }
        int index = 1;
        try {
            index = Integer.parseInt(number) - 1;
        } catch (NumberFormatException e) {
            System.out.println("Unable to remove: index is not a number");
        }
        try {
            tasks.remove(tasks.get(index));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Unable to remove: you don't have that many tasks!");
        }
        save();
    }

    public void save() {
        List<String> temp = new ArrayList<>();
        for (int i = 0; i < tasks.size(); i++) {
            temp.add(tasks.get(i).name);
        }
        try {
            Files.write(myPath, temp);
        } catch (IOException e) {
            System.out.println("Unable to save file");
        }
    }

    public void checkTask(int index) {
        Path myPath = Paths.get("tasks.txt");
        try {
            List<String> lines = Files.readAllLines(myPath);
            if (lines.size() < 2) {
                System.out.println("No can do. The file has less than 2 tasks.");
            } else {
//                lines.set(index - 1, lines.get(index - 1) + "%$");
                tasks.get(index - 1).complete();
            }
            Files.write(myPath, lines);
        } catch (IOException e) {
            System.out.println("Unable to read file.");
        }
    }

    public void orderTasks() {
        Path myPath = Paths.get("tasks.txt");
        try {
            List<String> lines = Files.readAllLines(myPath);
            Collections.sort(lines);
            Files.write(myPath, lines);
        } catch (IOException e) {
            System.out.println("Unable to read file.");
        }
    }
}
