import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;
    Guest guest;

    @Before
    public void before(){
        bedroom = new Bedroom(7, RoomType.SINGLE);
        guest = new Guest("Jane");
    }

    @Test
    public void hasGuestList(){
        assertEquals(0, bedroom.numberOfGuests());
    }
    @Test
    public void canAddGuest(){
        bedroom.addGuest(guest);
        assertEquals(1, bedroom.numberOfGuests());
    }

}
