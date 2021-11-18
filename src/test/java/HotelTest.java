import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Guest guest;
    Bedroom bedroom;

    @Before
    public void setUp(){
        hotel = new Hotel();
        guest = new Guest("Frank");
        bedroom = new Bedroom(2, RoomType.SINGLE);
    }

    @Test
    public void checkHotelHasRooms(){
        hotel.addRoom();
        assertEquals(1, hotel.roomCount());
    }


//    @Test
//    public void checkRoomIsVacant(){
//        assertEquals(true, hotel.roomIsVacant());
//    }
}
