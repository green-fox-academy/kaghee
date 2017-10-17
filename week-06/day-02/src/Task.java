public class Task implements Comparable<Task>{
    String name;
    boolean isComplete;

    public Task(String name) {
        this.name = name;
        isComplete = false;
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
