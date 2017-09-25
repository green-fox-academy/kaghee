public class Counter {
    int value;
    int init;

    public Counter() {
        this.value = 0;
        this.init = 0;
    }

    public Counter(int v) {
        this.value = v;
        this.init = v;
    }

    public void add(int a) {
        this.value += a;
    }

    public void add() {
        this.value++;
    }

    public int get() {
        return this.value;
    }

    public void reset() {
        this.value = this.init;
    }

    public static void main(String[] args) {
        Counter pelda = new Counter(44);
        System.out.println(pelda.value);
    }
}
