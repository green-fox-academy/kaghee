public class Shifter implements CharSequence {
    String word;
    int shiftNum;

    public Shifter(String word, int shiftNum) {
        this.word = word;
        this.shiftNum = shiftNum;
    }

    @Override
    public int length() {
        return word.length();
    }

    @Override
    public char charAt(int index) {
        char[] chars = word.toCharArray();
        return chars[index + shiftNum];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < end; i++) {
            sb.append(word.charAt(i + shiftNum));
        }
        return sb;
    }
}
