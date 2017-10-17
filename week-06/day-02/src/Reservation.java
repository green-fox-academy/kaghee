import java.util.ArrayList;

public class Reservation implements Reservable {
    String code;
    String dow;

    public Reservation() {
        code = this.getCode();
        dow = this.getDow();
    }

    @Override
    public String getDow() {
        String[] days = new String[]{"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
        return days[(int)(Math.random() * 7)];
    }

    @Override
    public String getCode() {
        ArrayList<Character> chars = new ArrayList<>();
        int index;

        for (int i = 48; i < 58; i++) {
            chars.add((char)(i));
        }
        for (int i = 65; i < 91; i++) {
            chars.add((char)(i));
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 8; i++) {
            index = (int)(Math.random() * 36);
            sb.append(chars.get(index));
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return ("Booking# " + code + " for " + dow);
    }
}
