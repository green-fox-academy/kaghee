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
        StringBuilder sb = new StringBuilder();
        for (int i = word.length() - 1 - start; i > word.length() - 1 - end; i--) {
            sb.append(word.charAt(i));
        }
        return sb;
    }
}
