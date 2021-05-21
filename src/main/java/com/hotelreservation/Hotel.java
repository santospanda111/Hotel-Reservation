package com.hotelreservation;

public class Hotel {
    public String hotelName;
    public int weekDayRate,weekEndRate,totalRate;
    /**
     * here i have created one more parameterised constructor which will initialise hotelName, weekday rate and weekEnd rate.
     * @param hotelName
     * @param weekDayRate
     * @param weekEndRate
     */
    public Hotel(String hotelName,int weekDayRate,int weekEndRate){
        this.hotelName=hotelName;
        this.weekDayRate=weekDayRate;
        this.weekEndRate=weekEndRate;
    }
    /**
     * this is a overridden method which will print hotelname,weekdayrate and weekEnd rate.
     * @return
     */
    public String toString() {
        return "Hotel: " + hotelName + "Weekday Rate: " + weekDayRate+" & WeekEnd Rate: "+weekEndRate+" & Totalrate is: "+totalRate;
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
     * In this setter method i have taken the parameters below and added totalRate which will add both weekdayRate and weekEndRate.
     * @param weekDayCount
     * @param weekEndsCount
     */
    public void setRate(int weekDayCount,int weekEndsCount){
        this.weekDayRate = this.weekDayRate*weekDayCount;
        this.weekEndRate = this.weekEndRate*weekEndsCount;
        this.totalRate = this.weekDayRate + this.weekEndRate;
    }
    /**
     * @return weekDaysRate+weekEndsRate
     */
    public int getRate() {
        return this.weekDayRate + this.weekEndRate;
    }
    /**
     * @return totalrate
     */
    public int getTotalRate() {
        return this.totalRate;
    }
    /**
     * here i have added welcome message.
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Welcome to Hotel Reservation Program");
    }
}
