public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        int totalSec = 24 * 60 * 60;

        System.out.println(totalSec - (currentHours * 3600 + currentMinutes * 60 + currentSeconds));
    }
}