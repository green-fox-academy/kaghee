public class Shifter implements CharSequence {
    String word;
    int num;

    public Shifter(String word, int num) {
        this.word = word;
        this.num = num;
    }
    
    @Override
    public int length() {
        return 0;
    }

    @Override
    public char charAt(int index) {
        return 0;
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }
}
