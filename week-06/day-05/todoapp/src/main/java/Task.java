public class Task implements Comparable<Task>{
    String name;
    private int id;
    private static int idCounter;
    boolean isComplete;

    public Task(String name) {
        idCounter++;
        this.id = idCounter;
        if (name.endsWith(";complete")) {
            this.name = name.substring(0, name.length() - 9);
            isComplete = true;
        } else {
            this.name = name;
            isComplete = false;
        }
    }

    public void complete() {
        this.isComplete = true;
    }

    @Override
    public int compareTo(Task t) {
        if (!this.isComplete && t.isComplete) {
            return -1;
        } else if (this.isComplete && !t.isComplete) {
            return 1;
        } else {
            return 0;
        }
    }
}