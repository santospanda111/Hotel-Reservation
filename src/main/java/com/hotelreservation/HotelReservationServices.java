package com.hotelreservation;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.stream.Collectors;

public class HotelReservationServices {
    /**
     * here i have created an arraylist to store values of hotel name and rates.
     */
    public List<Hotel> hotelList = new ArrayList<>();

    public void addHotel(Hotel hotel) {
        hotelList.add(hotel);
        for (Hotel hotelDetails:hotelList) {
            System.out.println("Hotel name:"+hotelDetails.getName()+"Total rate: "+hotelDetails.getRate());
        }
    }

    /**
     * this method will return the values.
     *
     * @return
     */
    public List<Hotel> getHotels() {
        return hotelList;
    }

    /**
     * here i have taken the dates as YYYY-MM-DD format.
     * @param firstDate
     * @param lastDate
     * @return
     */
    public int NoOfDays(String firstDate,String lastDate) {
        LocalDate startDate = LocalDate.parse(firstDate);
        LocalDate endDate = LocalDate.parse(lastDate);
        int noOfDays=(int) ChronoUnit.DAYS.between(startDate,endDate);
        return  noOfDays;
    }

    /**
     * this method will take no of days as parameter and check the cheapestRate by using min operation.
     * @param NoOfDays
     * @return cheapestRate.
     */
    public Hotel findCheapestHotel(int NoOfDays) {
        hotelList.stream().map(p -> {p.setRate(NoOfDays); return p.getRate(); }).collect(Collectors.toList());
        Hotel cheapestRate =  hotelList.stream().min(Comparator.comparing(Hotel::getRate)).orElse(null);
        return cheapestRate;
    }
}