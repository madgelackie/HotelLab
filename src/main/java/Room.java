import java.util.ArrayList;

public abstract class Room {

    private ArrayList<Guest> guests;

    public Room() {
        this.guests = new ArrayList<>();
    }

    public ArrayList<Guest> getGuests() {
        return guests;
    }

    public int numberOfGuests(){
        return guests.size();
    }

    public void addGuest(Guest guest){
        guests.add(guest);
    }
}
