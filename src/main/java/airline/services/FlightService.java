package airline.services;

import airline.model.Flight;
import airline.model.FlightClassCategory;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class FlightService {

    public List<Flight> getFlightList() throws ParseException {

        SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");

        List<Flight> flightList = new ArrayList<Flight>();


        Flight flt = new Flight();
        flt.flightNo = 1;
        flt.flightName = "JET";
        flt.sourceCity = "Banglore";
        flt.destination = "Hyderabad";
        flt.seats = 10;
        flt.departureDate = fmt.parse("2017-09-07");//new Date(2017,8,06);
        flt.flightClassCategories = Arrays.asList(
//                new FlightClassCategory("Economy",10),
//                new FlightClassCategory("Business",10),
                new FlightClassCategory("First",10)
        );

        flightList.add(flt);

        flt = new Flight();
        flt.flightNo = 2;
        flt.flightName = "IndianAirLines";
        flt.sourceCity = "Banglore";
        flt.destination = "Hyderabad";
        flt.seats = 10;
        flt.departureDate =fmt.parse("2017-09-07");// new Date(2017,8,07);

        flt.flightClassCategories = Arrays.asList(
//                new FlightClassCategory("Economy",10),
//                new FlightClassCategory("Business",10),
                new FlightClassCategory("First",10)
        );

        flightList.add(flt);

        flt = new Flight();
        flt.flightNo = 3;
        flt.flightName = "Kingfisher";
        flt.sourceCity = "Banglore";
        flt.destination = "Delhi";
        flt.seats = 10;
        flt.departureDate = fmt.parse("2017-09-06"); //new Date(2017,8,07);
        flt.flightClassCategories = Arrays.asList(
                new FlightClassCategory("Economy",10),
                new FlightClassCategory("Business",10),
                new FlightClassCategory("First",10));

        flightList.add(flt);


        flt = new Flight();
        flt.flightNo = 4;
        flt.flightName = "Spicejet";
        flt.sourceCity = "Delhi";
        flt.destination = "Banglore";
        flt.seats = 10;
        flt.departureDate = fmt.parse("2017-09-07"); //new Date(2017,8,06);

        flt.flightClassCategories = Arrays.asList(
                new FlightClassCategory("Economy",10),
                new FlightClassCategory("Business",10),
                new FlightClassCategory("First",10));

        flightList.add(flt);

        return flightList;
    }
}
