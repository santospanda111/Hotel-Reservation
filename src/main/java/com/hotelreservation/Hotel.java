package com.hotelreservation;

public class Hotel {
    public String hotelName;
    public int dailyRate;

    /**
     * this one is a parameterised constructor which will initiate the value.
     * @param hotelName
     * @param dailyRate
     */
    public Hotel(String hotelName, int dailyRate) {
        this.hotelName = hotelName;
        this.dailyRate = dailyRate;
    }
    /**
     * here i have added welcome message.
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Welcome to Hotel Reservation Program");
    }
}
