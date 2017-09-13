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

        Flight flt = new Flight("F0001",0,"Boeing777-200LR(77L)","Banglore","Hyderabad",fmt.parse("2017-09-07"),"",Arrays.asList(
                new FlightClassCategory("First",8, 20000.00,5),
                new FlightClassCategory("Business",35,13000.00,5),
                new FlightClassCategory("Economy",195,6000.00,5)
        ));

        flightList.add(flt);

        flt = new Flight("F0002",0,"Airbus A319 V2","Banglore","Hyderabad",fmt.parse("2017-09-07"),"",Arrays.asList(
                new FlightClassCategory("First",0,0.00,0),
                new FlightClassCategory("Business",0,0.00,0),
                new FlightClassCategory("Economy",144,4000.00,100)
        ));

        flightList.add(flt);

        flt = new Flight("F0003",172,"Airbud A321","Banglore","Delhi", fmt.parse("2017-09-06"),"", Arrays.asList(
                new FlightClassCategory("First",0,0.00,0),
                new FlightClassCategory("Business",20,10000.00,0),
                new FlightClassCategory("Economy",152,5000.00,120)
        ));

        flightList.add(flt);

        return flightList;
    }
}
