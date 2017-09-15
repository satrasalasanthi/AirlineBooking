package airline.model;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Flight {

    public String flightNo;
    public int seats;
    public String flightName;
    public String sourceCity;
    public String destination;
    public Date departureDate;

    @NotNull
    public  String flightClass;

    public Double getFare() {
        return fare;
    }

    public void setFare(Double fare) {
        this.fare = fare;
    }

    public Double fare;

    public Flight()
    {

    }

    public Flight(String flightNo, int seats, String flightName, String sourceCity, String destination, Date departureDate, String flightClass, List<FlightClassCategory> flightClassCategories) {
        this.flightNo = flightNo;
        this.seats = seats;
        this.flightName = flightName;
        this.sourceCity = sourceCity;
        this.destination = destination;
        this.departureDate = departureDate;
        this.flightClass = flightClass;
        this.flightClassCategories = flightClassCategories;
        this.fare =0.00;
    }

    public String getFlightClass() {
        return flightClass;
    }

    public void setFlightClass(String flightClass) {
        this.flightClass = flightClass;
    }

    public  List<FlightClassCategory> flightClassCategories;

    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    public void setFlightNo(String flightNo) {
        this.flightNo = flightNo;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }

    //Getting the classcategory for all the flights
    public List<FlightClassCategory> getFlightClassCategories() {
        return flightClassCategories;
    }

    public void setFlightClassCategories(List<FlightClassCategory> flightClassCategories) {
        this.flightClassCategories = flightClassCategories;
    }

    public void setSourceCity(String source) {
        this.sourceCity = source;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }


    public String getFlightNo() {
        return flightNo;
    }

    public String getFlightName() {
        return flightName;
    }

    public String getSourceCity() {
        return sourceCity;
    }

    public String getDestination() {

        return destination;
    }


    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }



}
