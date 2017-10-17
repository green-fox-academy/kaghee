public class Gnirts implements CharSequence {
    String word;

    public Gnirts(String word) {
        this.word = word;
    }

    @Override
    public int length() {
        return word.length();
    }

    @Override
    public char charAt(int index) {
        char[] chars = word.toCharArray();
        return chars[chars.length - index - 1];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }
}
