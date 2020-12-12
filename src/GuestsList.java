import java.util.ArrayList;
import java.util.List;

public class GuestsList {
    public static void main(String[] args) {
        List<String> guests = new ArrayList<String>();

        guests.add("John");
        guests.add("Suwi");
        guests.add("Maria");

        System.out.println(guests.size());

        // Replace two guests
        guests.set(1, "Chimba");
        guests.set(0, "Yo");

        System.out.println("The guests are: ");
        for (String guest:guests) {
            System.out.println(guest);
        }
    }
}
