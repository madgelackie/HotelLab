import java.util.ArrayList;

public class ConferenceRoom extends Room {
    private String name;

    public ConferenceRoom(ArrayList<Guest> guests, String name) {
        this.name = name;
    }
}
