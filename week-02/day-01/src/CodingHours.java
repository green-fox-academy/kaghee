public class CodingHours {
    public static void main(String[] args) {
        int hrs = 6;
        int weeks = 17;
        int avgHours = weeks * 5 * hrs;

        System.out.println("An average GF attendee codes about " + avgHours + " hours in a semester.");

        int avgWork = 52;
        int weekHours = 5 * hrs;

        System.out.println("S/he would code for roughly " + avgHours * 100 / (avgWork * weeks) + "% of their time.");
    }
}