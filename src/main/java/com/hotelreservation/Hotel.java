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
     * this is a overridden method which will print hotelname and rate.
     * @return
     */
    public String toString() {
        return "Hotel: " + hotelName + "  Rate: " + dailyRate;
    }
    /**
     * here i have used setter and getter method to set name and rate and according to that will get the value.
     * @return
     */
    public String getName() {
        return hotelName;
    }
    public void setName(String name) {
        this.hotelName = hotelName;
    }
    /**
     * this method will take the no.ofdays and then set the rate.
     * @param noOfDays
     */
    public void setRate(int noOfDays) {
        this.dailyRate = this.dailyRate*noOfDays;
    }
    /**
     * @return total rate.
     */
    public int getRate() {
        return dailyRate;
    }
    /**
     * here i have added welcome message.
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Welcome to Hotel Reservation Program");
    }
}
