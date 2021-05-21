package com.hotelreservation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

/**
 * this test case will check that hotel is added or not.
 */
public class HotelreservationTest {
    @Test
    public void givenHotel_whenInvokeAddHotel_shoulBeAbleToAdd() {
        HotelReservationServices hotelReservationService = new HotelReservationServices();
        Hotel hotel = new Hotel("Lakewood",110);
        hotelReservationService.addHotel(hotel);
        List hotelList = hotelReservationService.getHotels();
        Assertions.assertTrue(hotelList.contains(hotel));
    }

    /**
     * this test case will check the cheapestHotel from the list according to the days.
     */
    @Test
    public void shouldBeAbleToReturnCheapestHotel() {
        HotelReservationServices hotelReservationService1 = new HotelReservationServices();
        Hotel Lakewood = new Hotel("Lakewood",110);
        Hotel Bridgewood = new Hotel("Bridgewood",160);
        Hotel RidgeWood = new Hotel("Ridgewood",220);
        hotelReservationService1.addHotel(Lakewood);
        hotelReservationService1.addHotel(Bridgewood);
        hotelReservationService1.addHotel(RidgeWood);
        int Days = hotelReservationService1.NoOfDays("2021-05-21","2021-05-26");
        Hotel result = hotelReservationService1.findCheapestHotel(Days);
        System.out.println(result);
        Assertions.assertEquals(Lakewood,result);
    }
}
