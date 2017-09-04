package airline.model;

import java.util.ArrayList;
import java.util.List;

public class Flight {

    public int flightNo;
    public int seats;
    public String flightName;
    public String source;
    public String destination;

    public void setFlightNo(int flightNo) {
        this.flightNo = flightNo;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }

    public void setSource(String source) {
        this.source = source;
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

    public String getSource() {
        return source;
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
