package com.hotelreservation;

import java.util.*;

public class HotelReservationServices {
    /**
     * here i have created an arraylist to store values of hotel name and rates.
     */
    private List<Hotel> hotelList = new ArrayList<>();

    public void addHotel(Hotel hotel) {
        hotelList.add(hotel);
    }

    /**
     * this method will return the values.
     * @return
     */
    public List<Hotel> getHotels() {
        return hotelList;
    }
}
