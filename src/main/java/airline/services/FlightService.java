package airline.services;

import airline.model.Flight;

import java.util.ArrayList;
import java.util.List;

public class FlightService {

    public List<Flight> getFlightList() {
        List<Flight> flightList = new ArrayList<Flight>();

        Flight flt = new Flight();
        flt.flightNo = 1;
        flt.flightName = "JET";
        flt.source = "Banglore";
        flt.destination = "Hyderabad";
        flt.seats = 10;
        flightList.add(flt);

        flt = new Flight();
        flt.flightNo = 2;
        flt.flightName = "IndianAirLines";
        flt.source = "Banglore";
        flt.destination = "Hyderabad";
        flt.seats = 10;
        flightList.add(flt);

        flt = new Flight();
        flt.flightNo = 3;
        flt.flightName = "Kingfisher";
        flt.source = "Banglore";
        flt.destination = "Delhi";
        flt.seats = 10;
        flightList.add(flt);


        flt = new Flight();
        flt.flightNo = 4;
        flt.flightName = "Spicejet";
        flt.source = "Delhi";
        flt.destination = "Banglore";
        flt.seats = 10;
        flightList.add(flt);

        return flightList;
    }
}
