public class Task implements Comparable<Task>{
    String name;
    String descr;
    private int id;
    private static int idCounter;
    boolean isComplete;

    public Task(String descr) {
        idCounter++;
        this.id = idCounter;
        this.descr = descr;
        if (descr.endsWith(";complete")) {
            this.name = descr.substring(0, descr.length() - 9);
            isComplete = true;
        } else {
            this.name = descr;
            isComplete = false;
        }
    }

    public void complete() {
        this.isComplete = true;
        this.descr += ";complete";
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