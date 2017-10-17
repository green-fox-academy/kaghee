import java.util.ArrayList;

public class ReservationApp {
    public static void main(String[] args) {
        ArrayList<Reservation> list = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            list.add(new Reservation());
        }

        for (Reservation res: list) {
            System.out.println(res);
        }
    }
}
