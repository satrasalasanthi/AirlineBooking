package airline.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Flight {

    public int flightNo;
    public int seats;
    public String flightName;
    public String sourceCity;
    public String destination;
    public Date departureDate;
    public  String flightClass;

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

    public void setFlightNo(int flightNo) {
        this.flightNo = flightNo;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }

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


    public int getFlightNo() {
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
