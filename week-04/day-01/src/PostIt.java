public class PostIt {
    String backgroundColor;
    String text;
    String textColor;

    public PostIt(String bgcolor, String text, String color) {
        this.text = text;
        this.backgroundColor = bgcolor;
        this.textColor = color;
    }

    public static void main(String[] args) {
        PostIt first = new PostIt("orange", "Idea 1", "blue");
        PostIt second = new PostIt("pink", "Awesome", "black");
        PostIt third = new PostIt("yellow", "Superb!", "green");
    }
}
