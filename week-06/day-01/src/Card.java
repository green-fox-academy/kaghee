public class Card {
    String value;
    String color;
    int valueInInt;

    public Card(String value, String color) {
        this.value = value;
        this.color = color;
    }

    public int getValueInInt() {
        if (this.value.equals("madar")) {
            valueInInt = 14;
        } else if (this.value.equals("J")) {
            valueInInt = 11;
        } else if (this.value.equals("Q")) {
            valueInInt = 12;
        } else if (this.value.equals("K")) {
            valueInInt = 13;
        } else {
            valueInInt = Integer.valueOf(this.value);
        }
        return valueInInt;
    }



    @Override
    public String toString() {
        return this.color + this.value;
    }
}
